import java.util.*;
import java.util.ArrayList;
public class collectionProgram {
    public  static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        ArrayList<String> arrayList=new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.startsWith("-")) {
                System.out.println("Terminating input.");
                break;
            }
            arrayList.add(input);
        }scanner.close();

        System.out.println("Your ArrayList:");
        System.out.println(arrayList);
        Collections.reverse(arrayList);
        System.out.println(arrayList);
//add adds new value and moves other value or shift
        arrayList.add(2,"3");
        System.out.println(arrayList);
        // set replaces the value
        arrayList.set(1,"rgs");
        System.out.println(arrayList);
        System.out.println(arrayList.get(arrayList.size()-1));



    }
}
