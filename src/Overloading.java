public class Overloading {
    static void sum(int a){
        System.out.println(a+10);
    }
    static double sum(int a,double b){
        return a+b;
    }

    static void sum(int a,int b,float c){
        System.out.println(a+b+c);
    }
    static void sum(int a,int b,int c,int d){
        System.out.println(a+b+c+d);

    }
    public static  void main(String [] args){
        sum(10);
        System.out.println(sum(10,20.4));
        sum(20,30,45.07f);
        sum(1,2,3,4);
    }
}
