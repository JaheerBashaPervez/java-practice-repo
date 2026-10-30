import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ArrayListFilteringPractice {

	public static void main(String[] args) {

		ArrayList<Rates> initialArray = new ArrayList<>();
		
		initialArray.add(new Rates(1, "sun", "0900-2100", "America/Chicago", 2000));
		initialArray.add(new Rates(2, "wed", "0600-1800", "America/Chicago", 1750));
		initialArray.add(new Rates(3, "mon", "0900-2100", "America/Chicago", 1500));
		initialArray.add(new Rates(4, "thurs", "0600-2100", "America/Chicago", 2000));
		initialArray.add(new Rates(5, "tues", "0900-2100", "America/Chicago", 1500));
		initialArray.add(new Rates(6, "thurs", "0900-2100", "America/Chicago", 1500));
		initialArray.add(new Rates(7, "mon", "0600-2100", "America/Chicago", 2000));
		initialArray.add(new Rates(8, "sat", "0900-2100", "America/Chicago", 2000));
		initialArray.add(new Rates(9, "sat", "0600-1800", "America/Chicago", 1750));
		initialArray.add(new Rates(10, "fri", "0600-2100", "America/Chicago", 2000));
		initialArray.add(new Rates(11, "mon", "0600-2100", "America/Chicago", 2000));
		
		Collections.sort(initialArray, Comparator.comparing(Rates::getDays));

		
//		Collections.sort(initialArray, (r1,r2)->{
//			return r1.getPrice()>r2.getPrice()? 1 : -1;
//		});;
		
		
		// initialArray.forEach(Rates :: toString);
		initialArray.forEach(System.out::println);

	}
}