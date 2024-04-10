class Outer {
    private int a = 10;
    void message() {
        System.out.println("Outer class message: " + a);
    }
    class nested1 {
        public int b = 15;
        void display() {
            message();
            System.out.println("Nested derived class message: "+a+" "+b);
        }
    }
    class nested2 extends nested1 {
        public int c = 20;
        void display1() {
            display();
            System.out.println("Nested derived class message: "+a+" "+b+" "+c);
        }
    }
    public static void main() {
        Outer obj = new Outer();
        Outer.nested2 obj1 = obj.new nested2();
        obj1.display1();
    }
}
