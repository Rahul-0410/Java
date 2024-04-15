import java.util.*;
public class Collection1 {
    public  static  void main(String [] args){
        Collection<String> collection=new ArrayList<>();
        collection.add("New York");
        collection.add("Atlanta");
        collection.add("Dallas");
        collection.add("Madison");

        Iterator<String> iterator=collection.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next().toUpperCase());
        }
        collection.remove("Madison");
        collection.remove("Atlanta");
//        System.out.println(iterator.remove());
//        while(iterator.hasNext()){
//            System.out.println(iterator.next().toUpperCase());
//        }
        System.out.println(collection);
    }
}
