import  java.util.*;
public class jagged_array {
    public  static  void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int myArray[][] = new int [3][];
//        myArray[0] = new int[]{1,2,3};
//        myArray[1] = new int[]{4,5};
//        myArray[2] = new int[]{6,7,8,9,10};
        myArray[0] = new int[3];
        myArray[1] = new int[2];
        myArray[2] = new int[5];

        System.out.println("Enter your values");
        for (int i =0;i< myArray.length;i++) {
            for (int j =0; j<myArray[i].length;j++){
                myArray[i][j]= sc.nextInt();
            }
        }

        System.out.println("Two dimensional array: ");
        for (int i =0;i< myArray.length;i++) {
            for (int j =0; j<myArray[i].length;j++){
                System.out.print(myArray[i][j] + " ");
            }
            System.out.println("\n");
        }
    }

}
