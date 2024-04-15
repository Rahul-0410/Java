
class fun<T>{
    T a;
    void fun(T b){
        a=b;
        System.out.println(a);
    }
}
public class Generic1{
    public static void main(String[] args){
        fun<Integer> obj=new fun<Integer>();
        fun<String> obj1=new fun<String>();
        obj.fun(5);
        obj1.fun("Hello");
    }
}