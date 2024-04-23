import java.util.*;

//import java.util.*;
//public class arraylist {
//    public static  void main(String [] args){
//        ArrayList<Integer> collection=new ArrayList<>();
//        collection.add(5);
//        collection.add(2);
//        collection.add(0);
//        collection.add(1);
//
//        Iterator<Integer> iter=collection.iterator();
////        while(iter.hasNext()){
////            System.out.println(iter.next().toUpperCase());
////        }
//
//        Collections.sort(collection);
//        while(iter.hasNext()){
//            System.out.println(iter.next());
//        }
//    }
//}

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> collection = new ArrayList<>();
        collection.add(5);
        collection.add(2);
        collection.add(0);
        collection.add(1);

        Collections.sort(collection);

        // Re-initialize the iterator after sorting
        Iterator<Integer> iter = collection.iterator();

        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}