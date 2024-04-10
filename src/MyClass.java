public class MyClass {
    private int value;

    // Constructor with no parameters
    public MyClass() {
        this.value = 0;
    }

    // Constructor with one parameter
    public MyClass(int value) {
        this.value = value;
    }

    // Constructor with two parameters
    public MyClass(int value1, int value2) {
        this.value = value1 + value2;
    }

    // Getter method for value
    public int getValue() {
        return value;
    }

    public static void main(String[] args) {
        // Create objects using different constructors
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass(5);
        MyClass obj3 = new MyClass(3, 7);

        // Print values of objects
        System.out.println("Value of obj1: " + obj1.getValue());
        System.out.println("Value of obj2: " + obj2.getValue());
        System.out.println("Value of obj3: " + obj3.getValue());
    }
}

