import java.util.*;
public class Percentage {
    public static  void main(String [] args) {
        Scanner sc=new Scanner(System.in);
        int total_marks=500;
        System.out.print("Enter the marks of subject1: ");
        int mark1=sc.nextInt();
        System.out.print("Enter the marks of subject2: ");
        int mark2=sc.nextInt();
        System.out.print("Enter the marks of subject3: ");
        int mark3=sc.nextInt();
        System.out.print("Enter the marks of subject4: ");
        int mark4=sc.nextInt();
        System.out.print("Enter the marks of subject5: ");
        int mark5=sc.nextInt();

        int total =mark1+mark2+mark3+mark4+mark5;
        float per= (float)total/total_marks*100;
        System.out.println("The percentage of the student is: "+per+"%");

    }

}
