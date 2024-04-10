// Online Java Compiler
// Use this editor to write, compile and run your Java code online
//multilevel inheritance
class A{
    void display(){
        System.out.println("this is base class method");
    }
}
class B extends A{
    void display1(){
        System.out.println("this is a derived class method");
    }
}
//class C extends B{
//    void display2(){
//        System.out.println("this is derived from derived class");
//    }
//}
public class Inheritance {
    public static void main(String[] args) {
        B obj=new B();
        obj.display1();
        obj.display();

//        obj.display2();
    }
}
