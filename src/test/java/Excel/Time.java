package Excel;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class Time {
	
public String getcurrentTime() {
		
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		System.out.println(timestamp);
		
		SimpleDateFormat dateformat = new SimpleDateFormat("ddMMyyyy_hhmmss");
		System.out.println(dateformat.format(timestamp));
		
		return dateformat.format(timestamp);
		
		
		
	}
	
	public static void main(String[] args) {
		Time  printTime = new Time();
		String time = printTime.getcurrentTime();
		System.out.println(time);
		
	}

}


