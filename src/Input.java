import java.util.Scanner;
public class Input {
    public static void main(String [] args){

        System.out.print("Taking input:");
    Scanner sc=new Scanner(System.in);
//        System.out.println("Enter number1:");
//        int a=sc.nextInt();
//        System.out.println("Enter number2:");
//        int a1=sc.nextInt();
//        System.out.println(a+a1);

//        boolean b1=sc.hasNextInt();
//        System.out.println(b1);

        //this will not print words after space
//        String str=sc.next();
        // this will give output of all the words and spaces
        String str=sc.nextLine();
        System.out.println(str);
    }
}
