import java.util.*;
public class loops2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int origin = n;
//        int result = 0;
//        while (n > 0) {
//            result *= 10;
//            result += n % 10 ;
//            n /= 10;
//        }
//        if (origin == result) {
//            System.out.println("palindrome");
//        } else {
//            System.out.println("no");
//        }

        int i =1;
        while (i <= n) {
            int j = i-1;
            while (j > 0) {
                System.out.print(" ");
                j--;
            }
                int k = n- i;
                while (k >= 0) {
                    System.out.print("#");
                    k--;
                }
                i++;
            System.out.println();
            }
        }
    }


