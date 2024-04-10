class Student {
    int id;
    String name;

    public void setData(int id,String name){
        this.id=id;
        this.name=name;
    }
    public void display(){
        System.out.println("id : "+id);
        System.out.println("name : "+name);
    }
}
class Marks extends Student{
    float javaMarks, CMarks, CppMarks;
    void setMarks(float j,float c, float cpp){
        javaMarks=j;
        CMarks=c;
        CppMarks=cpp;
    }
    void displayMarks(){
        System.out.println("Java Marks : "+ javaMarks);
        System.out.println("C Marks : "+ CMarks);
        System.out.println("Cpp Marks : "+ CppMarks);
    }

}

class Result extends Marks{
    float avg, total;
    void compute(){
        total=javaMarks+CMarks+CppMarks;
        avg= total/3;
    }
    void showresult(){
        System.out.println("Total is : "+total);
        System.out.println("Average of marks is : "+avg);

    }
}

public class Multi {
    public static void main(String[] a) {
        int id = Integer.parseInt(a[0]);
        String name = a[1];
        float javaMarks = Float.parseFloat(a[2]);
        float CMarks = Float.parseFloat(a[3]);
        float CppMarks = Float.parseFloat(a[4]);

        Result r = new Result();
        r.setData(id, name);
        r.display();
        r.setMarks(javaMarks, CMarks, CppMarks);
        r.displayMarks();
        r.compute(); // Call the compute method
        r.showresult();
    }
}
