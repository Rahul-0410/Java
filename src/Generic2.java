// multi instance
class fun1<T,U,V>{
    T a;
    U b;
    V e;
    void fun(T c, U d, V f){
        a=c;
        b=d;
        e=f;
        System.out.print(a+"	");
        System.out.println(b);
        System.out.println(e);
    }
}
public class Generic2{
    public static void main(String[] args){
        fun1<Integer,String,Integer> obj=new fun1<Integer,String,Integer>();
        fun1<String,Integer,Integer> obj1=new fun1<String,Integer,Integer>();
        obj.fun(5,"Five",3);
        obj1.fun("Hello",10,5);
    }
}
