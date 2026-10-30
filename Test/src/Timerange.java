
public class Timerange {
	public static void main(String[] args) {
		String dbTime= "0900-2100", inputStartTime= "1120",  inputEndTime="1620";
		
		if(Integer.parseInt(inputStartTime)>Integer.parseInt(dbTime.split("-")[0])&&
			Integer.parseInt(inputEndTime)<Integer.parseInt(dbTime.split("-")[1]))
			System.out.println("Success");
		
		
	}
}
