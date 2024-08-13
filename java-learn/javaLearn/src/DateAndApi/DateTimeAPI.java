package DateAndApi;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class DateTimeAPI {
	public static void main(String[] args) {
		LocalDate ld=LocalDate.now();//human
		System.out.println(ld);
		System.out.println(ld.getYear());
		System.out.println(ld.getMonth());
		System.out.println(ld.getDayOfMonth());
		Instant i=Instant.now();//machine
		System.out.println(i);
		
		LocalTime lt=LocalTime.now();
		System.out.println(lt);
		
		LocalDateTime ldt=LocalDateTime.now();
		System.out.println(ldt);
		
//		for(String val:ZoneId.getAvailableZoneIds()) {
//			System.out.println(val);
//		}
	}
}
