import java.time.LocalDateTime;
import java.math.BigInteger;
public class  Generator{
public static void  main(String arg[]){
LocalDateTime now = LocalDateTime.now();
String min   = String.valueOf( now.getMinute()     *2  );
String month = String.valueOf( now.getMonthValue() *60 );
String year  = String.valueOf( now.getYear()       *7  );
String hour  = String.valueOf( now.getHour()       *4  );
String day   = String.valueOf( now.getDayOfMonth() *9  );
String  strkey   = min+month+year+hour+day;
BigInteger Key   = new BigInteger (strkey);
System.out.println("key:- "+Key);
}
}
