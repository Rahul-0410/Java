import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
public class arrayNeg {



        public static void main(String[] args) {
            ArrayList<String> myList = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter strings (negative value to stop):");

            while (true) {
                String input = scanner.nextLine();
                if (isNegativeValue(input)) {
                    break;
                }
                myList.add(input);
            }

            System.out.println("\nYour list:");
            for (String item : myList) {
                System.out.println(item);
            }
            Collections.reverse(myList);
            System.out.println("sorted:");
            for (String item : myList) {
                System.out.println(item);
            }
        }

        private static boolean isNegativeValue(String input) {
            try {
                int value = Integer.parseInt(input);
                return value < 0;
            } catch (NumberFormatException e) {
                return false;
            }
        }
    }

//    import java.util.*;
//public class arraylist{
//    public static void main(String[] args) {
//        ArrayList<String> arrayList = new ArrayList<>();
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter strings (Enter a negative value to stop):");
//        while (true) {
//            String input = scanner.nextLine();
//            if (input.startsWith("-")) {
//                System.out.println("Terminating input.");
//                break;
//            }
//            arrayList.add(input);
//        }scanner.close();
//
//        System.out.println("Your ArrayList:");
//        System.out.println(arrayList);
//        Collections.reverse(arrayList);
//        System.out.println(arrayList);
//
//    }
//}
