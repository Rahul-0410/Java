import java.util.*;
class Employee{
    String name;
    int age;
    String address;
    Employee(String name, int age, String address){
        this.name=name;
        this.age=age;
        this.address=address;
    }
    void showInfo(){
        System.out.println("Name= "+name+" Age= "+age+" Address= "+address);
    }
    protected void finalize(){
        System.out.println("Garbage Method invoked and removed: ");
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String name=sc.nextLine();
        int age=sc.nextInt();
        sc.nextLine();
        String address=sc.nextLine();
        Employee e1=new Employee(name,age,address);
        Employee e2=new Employee(name,age,address);
        e1.showInfo();
        e1=null;
        e2=e1;
        System.gc();
    }

}
