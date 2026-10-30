package test;

import java.util.ArrayList;
import java.util.List;

public class CombiningDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			List<String> days= new ArrayList<String>();
			days.add("mon");
			days.add("thurs");
			days.add("fri");
			String combine=String.join(",", days);
			//days.forEach(combine->System.out.println());
			System.out.println(combine);
			//getDaysGroup(days);
		}

}
