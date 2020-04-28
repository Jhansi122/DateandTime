package TimeAndDate;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.Test;

public class SystemTimeAndDate 
{
@Test
 public void sysTime()
 {
	DateFormat date= new SimpleDateFormat("MM/dd/yyy HH:mm:ss");
	
	Date datee = new Date();
	
	String date1 = date.format(datee);
	System.out.println("-----------------------------------------");
	 System.out.println("Current date and time is " +date1);
	 System.out.println("-----------------------------------------");
 }
}
