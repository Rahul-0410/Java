import java.util.*;
//call by value
//public class ForDemo {
//
//    public int incrementFunction(int b) {
//        return ++b;
//    }
//
//    public static void main(String[] args) {
//        int a = 10;
//        ForDemo d = new ForDemo();
//
//        System.out.println("Original value of A: " + a);
//        System.out.println("After incrementing A: " + d.incrementFunction(a));
//    }
//}

import java.util.*;
//call by refrence
public class ForDemo {
    int a = 10;

    public int incrementFunction(ForDemo d) {
        return ++d.a;
    }

    public static void main(String[] args) {
        ForDemo d = new ForDemo();

        System.out.println("Original value of A: " + d.a);
        d.incrementFunction(d);
        System.out.println("After incrementing A: " + d.a);
    }
}


//import java.util.*;
//public class fordemo {
//    fordemo(){
//        System.out.println("java");
//    }
//    static{
//        System.out.println("Hello");
//        fordemo d=new fordemo();
//    }
//    public static void main(String [] args){
//        System.out.println("class");

//}
