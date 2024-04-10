class person{
    person(){
        System.out.println("Person class constructor");
    }
    person(int i){
        System.out.println("Person class constructor with parameter");
    }
}

class student extends person{
    student(){
        System.out.println("Student class constructor");
    }
    student(int i){
        this();
//        super(i);
        System.out.println("Student class constructor with parameter");
    }
}

class Super{
    public static void main(String[] args){
        student s=new student(5);
//        student sc=new student();
    }
}
