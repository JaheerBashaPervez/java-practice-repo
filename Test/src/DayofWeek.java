import java.util.HashMap;

public class DayofWeek {

	public static void main(String[] args) {
		HashMap<String, String> weekday= new HashMap<String, String>();
		
		weekday.put("sun", "SUNDAY");
		weekday.put("mon", "MONDAY");
		weekday.put("tue", "TUESDAY");
		weekday.put("tues", "TUESDAY");
		weekday.put("wed", "WEDNESDAY");
		weekday.put("thu", "THURSDAY");
		weekday.put("thur", "THURSDAY");
		weekday.put("thurs", "THURSDAY");
		weekday.put("fri", "FRIDAY");
		weekday.put("sat", "SATURDAY");
		
		System.out.println(weekday.get("sun"));

	}

}
