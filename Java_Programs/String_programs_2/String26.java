import java.util.*;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.TimeZone;
public class date_Time{
	public static void main(String[] args) {
		SimpleDateFormat date_time = new SimpleDateFormat("MMM dd,yyyy \nhh:mm aa");
		date_time.setTimeZone(TimeZone.getTimeZone("GMT"));
		System.out.println(date_time.format(new Date()));
	}
}
//Expected output:
//Aug 19,2020 
//05:17 PM
