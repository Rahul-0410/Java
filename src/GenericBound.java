
//only for number
class BankAccount<T extends Number>{
    public void display(T []t1){
        for(T i:t1){
            System.out.println(i+" ");
        }
    }
}
public class GenericBound {
    public static  void main(String [] args){
        BankAccount<Number> m= new BankAccount<>();
        Integer[] m1={100,200,300,400};
        Double[]m2={20.45,56.89};
        Character[] m3={'a','b','c'};
        m.display(m1);
        m.display(m2);
//        m.display(m3);
    }
}

// upper bound wildcards are used to restrict the upper bound of parameter type
// public static void deposit(ArrayList<? extends Number> money){}
