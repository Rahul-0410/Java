import java.util.*;

public class Loops {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        for (int i = 1; i <= n; i++) {
//            // Print leading spaces
//            for (int j = n - i; j > 0; j--) {
//                System.out.print(" ");
//            }
//
//            // Print increasing numbers
//            for (int k = 1; k <= i; k++) {
//                System.out.print(k);
//            }
//
//            // Print decreasing numbers
//            for (int h = i - 1; h > 0; h--) {
//                System.out.print(h);
//            }i-1
//
//            System.out.println();
//        }
//    }
    public  static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        hello:
        for (int i = 0; i<=n;i++) {
            hi:
            for (int j = 1; j<= n;j++) {
                if (i == 2 || j == 3) {
                    continue hi;

                }
                System.out.println("i =" + i + " j = " + j);

            }
        }
    }

}

