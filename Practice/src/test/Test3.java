//import java.util.ArrayList;
//import java.util.List;
//
//public class Test3 {
//
//	public static void main(String[] args) {
//		List<Rates>  providedList = new ArrayList<>();
//		List<Rates>  finalList = new ArrayList<>();
//		providedList.add(new Rates("mon,tues,thurs","0900-2100","America/Chicago",1500 ));
//		providedList.add(new Rates("wed,fri,sun","0100-0500","America/Chicago",2000 ));
//		
//		
//		providedList.forEach(r->{
//			String[] s = r.getDays().split(",");
//			for(int i=0; i<s.length ; i++ ) {
//				finalList.add(new Rates(s[i],r.getTimes(),r.getTz(),r.getPrice()));
//			}
//		});
//		
//		finalList.forEach(r->System.out.println(r.getDays()+" "+r.getPrice()+" "+r.getTimes()+" "+r.getTz()));
//	}
//}
