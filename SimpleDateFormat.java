import java.text.SimpleDateFormat;
import java.util.Date;
public class SimpleDateFormat {

	public static void main(String[] args) {
		//creating a object for a date class
		Date d = new Date();
		//creating object for the SimpleDateFormat class and passing format as a string argument
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
		//using format method to format the date
		//format method return string only
		String formattedDate = sdf.format(d);
		System.out.println(formattedDate);
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MMMM-yyyy");
		String formattedDate1 = sdf1.format(d);
		System.out.println(formattedDate1);
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd-MMMM-yyyy HH:mm:ss");
		String formattedDate2 = sdf2.format(d);
		System.out.println(formattedDate2);
		
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd-MMMM-yyyy-zzzz");
		String formattedDate3 = sdf3.format(d);
		System.out.println(formattedDate3);
		
		SimpleDateFormat sdf4 = new SimpleDateFormat("E, dd-MMMM-yyyy HH:mm:ss - z");
		String formattedDate4 = sdf4.format(d);
		System.out.println(formattedDate4);
		
		
		//SimpleDateFormat s = new SimpleDateFormat();
		System.out.println(sdf.getCalendar());
		//System.out.println(sdf.getDateFormatSymbols());
		System.out.println(sdf.get2DigitYearStart());
		//System.out.println(sdf.getNumberFormat());
		System.out.println(sdf.getTimeZone());
		System.out.println(sdf.toPattern());
	
	}

}

//Output :
	//12-Feb-2023
	//12-February-2023
	//12-February-2023 17:40:24
	//12-February-2023-India Standard Time
	//Sun, 12-February-2023 17:40:24 - IST
	//java.util.GregorianCalendar[time=1676203824189,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Calcutta",offset=19800000,dstSavings=0,useDaylight=false,transitions=7,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2023,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=12,DAY_OF_YEAR=43,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=40,SECOND=24,MILLISECOND=189,ZONE_OFFSET=19800000,DST_OFFSET=0]
	//Fri Feb 12 17:40:24 IDT 1943
	//sun.util.calendar.ZoneInfo[id="Asia/Calcutta",offset=19800000,dstSavings=0,useDaylight=false,transitions=7,lastRule=null]
	//dd-MMM-yyyy
