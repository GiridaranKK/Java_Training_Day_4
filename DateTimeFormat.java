package com.day4;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class DateTimeFormat {

	public static void main(String[] args) {
		LocalDateTime ldt = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm a");
		String dateTime = dtf.format(ldt);
		System.out.println(dateTime);
		
		DateTimeFormatter dtf1 = DateTimeFormatter.BASIC_ISO_DATE;
		String dateTime1 = dtf1.format(ldt);
		System.out.println(dateTime1);
		
		DateTimeFormatter dtf2 = DateTimeFormatter.ISO_DATE;
		String dateTime2 = dtf2.format(ldt);
		System.out.println(dateTime2);
		
		DateTimeFormatter dtf3 = DateTimeFormatter.ISO_DATE_TIME;
		String dateTime3 = dtf3.format(ldt);
		System.out.println(dateTime3);
		
//		DateTimeFormatter dtf4 = DateTimeFormatter.ISO_INSTANT;
//		String dateTime4 = dtf4.format(ldt);
//		System.out.println(dateTime4);
		
		DateTimeFormatter dtf5 = DateTimeFormatter.ISO_LOCAL_DATE;
		String dateTime5 = dtf5.format(ldt);
		System.out.println(dateTime5);
		
		DateTimeFormatter dtf6 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
		String dateTime6 = dtf6.format(ldt);
		System.out.println(dateTime6);
		
		DateTimeFormatter dtf7 = DateTimeFormatter.ISO_LOCAL_TIME;
		String dateTime7 = dtf7.format(ldt);
		System.out.println(dateTime7);
		
//		DateTimeFormatter dtf8 = DateTimeFormatter.ISO_OFFSET_DATE;
//		String dateTime8 = dtf8.format(ldt);
//		System.out.println(dateTime8);
		
		DateTimeFormatter dtf9 = DateTimeFormatter.ISO_TIME;
		String dateTime9 = dtf9.format(ldt);
		System.out.println(dateTime9);
		
		DateTimeFormatter dtf10 = DateTimeFormatter.ISO_WEEK_DATE;
		String dateTime10 = dtf10.format(ldt);
		System.out.println(dateTime10);
		
//		DateTimeFormatter dtf11 = DateTimeFormatter.ISO_ZONED_DATE_TIME;
//		String dateTime11 = dtf11.format(ldt);
//		System.out.println(dateTime11);
//		
//		DateTimeFormatter dtf12 = DateTimeFormatter.RFC_121223_DATE_TIME;
//		String dateTime12 = dtf12.format(ldt);
//		System.out.println(dateTime12);
		
	}

}

//Output:
	//12-02-2023 05:42 pm
	//20230212
	//2023-02-12
	//2023-02-12T17:42:58.9036815
	//2023-02-12
	//2023-02-12T17:42:58.9036815
	//17:42:58.9036815
	//17:42:58.9036815
	//2023-W06-7

