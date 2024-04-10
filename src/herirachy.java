//use heriracy inheritence in the first base class calculate remainder ,
 //       frist derived class create function for multiplication , second dervied class find the quetient , take two numbers input from user pass these value to the METHOD
import java.util.*;

class A1{
    void remiander(int x,int y){
        System.out.println("Remander is: "+(x%y));
    }
}

class B1 extends A1{
    void mul(int x,int y){
        System.out.println("The multiplication is: "+x*y);
    }

}

class C extends A1{
    void quo(int x,int y){
        float q= (float) (x/y);
        System.out.println("The quotient is: "+q);
    }
}
public class herirachy {
    public  static  void main(String [] args){
        B1 obj=new B1();
        C obj1=new C();
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int num2=sc.nextInt();
        obj.remiander(num,num2);
        obj.mul(num,num2);
        obj1.remiander(6,10);
        obj1.quo(num,num2);
    }
}
