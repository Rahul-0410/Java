
class Sample{
    int a;
    String b;
//    Sample() {}
    //parametrized constructor
//    Sample(int a1,String b1){
//        a=a1;
//        b=b1;
//    }
    void display(){
        System.out.println("hello");
    }
    void display1(){
        display();
        System.out.println(" misha");
//    this.display();
    }
}

public class Constructor {
    public  static  void main(String [] args){
        Sample obj=new Sample();
        obj.display1();
    }
}
