package DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime {
public static void main(String[] args) {
	LocalDate ldate = LocalDate.now();
	System.out.println("time is " + ldate);
	
	LocalDateTime localDateTime = LocalDateTime.now();
	System.out.println("local date and time" +localDateTime);
	
	DateTimeFormatter dateTimeForm = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
	String myNewDate = localDateTime.format(dateTimeForm);
	System.out.println("new time" + myNewDate);
	
	
}
}
