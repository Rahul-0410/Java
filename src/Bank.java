interface I {
    float principal = 20000;
    int time = 2;
    float calculateInterest(float principal, int time);
}

class SBI implements I {
    float interest = 5.6f;

    public float calculateInterest(float principal, int time) {
        return (principal * interest * time) / 100;
    }
}

public class Bank {
    public static void main(String[] args) {
        I obj = new SBI();
        System.out.println(obj.calculateInterest(I.principal, I.time));
    }
}
