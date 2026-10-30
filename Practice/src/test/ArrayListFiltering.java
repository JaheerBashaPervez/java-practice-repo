package test;

import java.util.ArrayList;
import java.util.List;

public class ArrayListFiltering {

	public static void main(String[] args) {

		ArrayList<Rates> initialArray = new ArrayList<>();
		List<Rate> finalArray = new ArrayList<Rate>();

		String str = "";

		initialArray.add(new Rates(1,"sun", "0900-2100", "America/Chicago", 2000));
		initialArray.add(new Rates(2,"wed", "0600-1800", "America/Chicago", 1750));
		initialArray.add(new Rates(3,"mon", "0900-2100", "America/Chicago", 1500));
		initialArray.add(new Rates(4,"thurs", "0600-2100", "America/Chicago", 2000));
		initialArray.add(new Rates(5,"tues", "0900-2100", "America/Chicago", 1500));
		initialArray.add(new Rates(6,"thurs", "0900-2100", "America/Chicago", 1500));
		initialArray.add(new Rates(7,"mon", "0600-2100", "America/Chicago", 2000));
		initialArray.add(new Rates(8,"sat", "0900-2100", "America/Chicago", 2000));
		initialArray.add(new Rates(9,"sat", "0600-1800", "America/Chicago", 1750));
		initialArray.add(new Rates(10,"fri", "0600-2100", "America/Chicago", 2000));
		initialArray.add(new Rates(11,"mon", "0600-2100", "America/Chicago", 2000));
		
		for (int i = 0; i < initialArray.size(); i++) {
			if (!initialArray.get(i).getDays().equals("Done")) {
				Rate rate = new Rate();
				rate.setPrice(initialArray.get(i).getPrice());
				rate.setTimes(initialArray.get(i).getTimes());
				rate.setTz(initialArray.get(i).getTz());
				str = initialArray.get(i).getDays();
				for (int j = i + 1; j < initialArray.size(); j++) {
					if (!initialArray.get(j).getDays().equals("Done")) {
						if (rate.getTz().equals(initialArray.get(j).getTz())
								&& rate.getPrice() == initialArray.get(j).getPrice()
								&& rate.getTimes().equals(initialArray.get(j).getTimes())) {
							str = str.concat("," + initialArray.get(j).getDays());
							initialArray.get(j).setDays("Done");
						}
					}
				}
				rate.setDays(str);
				finalArray.add(rate);
				str = "";
			}
			
		}
		finalArray.forEach(s -> System.out.println(s));
	}

}
