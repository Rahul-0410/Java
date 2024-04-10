import java.text.SimpleDateFormat;
import java.time.*;
public class Time {
    public  static  void main(String [] args){
//        LocalTime obj=LocalTime.of(14,30);
//        obj=obj.plusHours(2).plusMinutes(15).plusSeconds(30).plusNanos(1);
//        System.out.println(obj);

        LocalDate obj=LocalDate.of(2007,1,1);
        obj=obj.withDayOfYear(90);
        System.out.println(obj);
    }
}
