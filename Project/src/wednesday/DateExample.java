package wednesday;
import java.text.*;
import java.util.Date;
public class DateExample {

	public static void main(String[] args) {
      Date Now=new Date();
      SimpleDateFormat s=new SimpleDateFormat("MM,dd,yyyy  hh mm ss a ");
      System.out.println(" " +s.format(Now));
      
	}

}
