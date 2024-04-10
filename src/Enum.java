//public class Enum {
//    public enum season{Summer,winter,autumn,monsoon};
//    public static  void main(String[] args){
//        for(season s: season.values()){
//            System.out.println(s);
//        }
//    }
//}

//OR
//enum season{Summer,winter,autumn,monsoon};
//public class Enum {
//    public static  void main(String[] args){
////        for(season s: season.values()){
////            System.out.println(s);
////        }
//        season obj=season.autumn;
//        System.out.println(obj);
//    }
//}

//enum with constructor
enum Month{
    January(31),February(29),March(31);
    int days;
    Month(int a){
        days=a;
    }
}

public class Enum{
    public static void main(String [] args){
        for(Month m:Month.values()){
//            Month obj=Month.num;
            System.out.println(m);
        }
    }
}
