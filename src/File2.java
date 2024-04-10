import java.util.*;
import java.io.*;
public class File2 {
public  static  void main(String [] args){

    try {
        File file = new File("example.txt");
        Scanner sc=new Scanner(file);
        int count=0;
        double sum=0;
        double min=Double.MAX_VALUE;
        double max=Double.MIN_VALUE;
        while(sc.hasNextLine()){
            String str=sc.nextLine();
            String [] val=str.split(",");
            for(String itr: val){
                double num=Double.parseDouble(itr.trim());
                sum+=num;
                count++;
                if(num<min){
                    min=num;
                }
                if(num>max){
                    max=num;
                }
            }
        }
        System.out.println("Max and min: "+max+" "+min);
        System.out.println("Sum is: "+sum);
        double avg=sum/count;
        System.out.println("Avg is: "+avg);

    } catch (IOException e){
        System.out.println("Error!");
    }
}

}
