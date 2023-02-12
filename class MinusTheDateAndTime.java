package com.day4;
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.LocalTime;
public class MinusTheDateAndTime {

	public static void main(String[] args) {
		LocalDateTime ldt = LocalDateTime.now();
		LocalDate ld = LocalDate.now();
		LocalTime lt = LocalTime.now();
		System.out.println(ldt);
		System.out.println(ld);
		System.out.println(lt);
		
		
		//minus the d&t in localdatetime
		System.out.println(ldt.minusDays(1));
		System.out.println(ldt.minusMonths(7));
		System.out.println(ldt.minusYears(22));
		System.out.println(ldt.minusWeeks(4));
		System.out.println(ldt.minusHours(9));
		System.out.println(ldt.minusMinutes(20));
		System.out.println(ldt.minusSeconds(2366));
		System.out.println(ldt.minusNanos(56767749));
		
		
		System.out.println(ld.minusDays(1));
		System.out.println(ld.minusMonths(7));
		System.out.println(ld.minusYears(22));
		System.out.println(ld.minusWeeks(4));
		
		
		System.out.println(lt.minusHours(9));
		System.out.println(lt.minusMinutes(20));
		System.out.println(lt.minusSeconds(2366));
		System.out.println(lt.minusNanos(56767749));
		System.out.println(lt.MAX);
		System.out.println(lt.MIN);
		
		
		
	}

}

//Output:
	//2023-02-12T17:45:24.000280200
	//2023-02-12
	//17:45:24.000280200
	//2023-02-11T17:45:24.000280200
	//2022-07-12T17:45:24.000280200
	//2001-02-12T17:45:24.000280200
	//2023-01-15T17:45:24.000280200
	//2023-02-12T08:45:24.000280200
	//2023-02-12T17:25:24.000280200
	//2023-02-12T17:05:58.000280200
	//2023-02-12T17:45:23.943512451
	//2023-02-11
	//2022-07-12
	//2001-02-12
	//2023-01-15
	//08:45:24.000280200
	//17:25:24.000280200
	//17:05:58.000280200
	//17:45:23.943512451
	//23:59:59.999999999
	//00:00
