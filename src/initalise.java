public class initalise {
    int x;
    initalise(){
        System.out.println("Default constructotr");
    }
    {
        x=10;
        System.out.println("initializer block");
    }
    initalise(int a){
        System.out.println("Default constructotr "+a);
    }

//    static {
//        initalise obj=new initalise();
//        initalise obj1=new initalise(4);
//    }

    public static  void main(String [] args){
        initalise obj=new initalise();
        initalise obj1=new initalise(4);
    }


}
