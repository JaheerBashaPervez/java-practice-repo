public class Rates {
	
	private int id;
	private String days;
	private String times;
	private String tz;
	private int price;

	
	public Rates(int id, String days, String times, String tz, int price) {
		super();
		this.id= id;
		this.days = days;
		this.times = times;
		this.tz = tz;
		this.price = price;
	}
	public String getDays() {
		return days;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setDays(String days) {
		this.days = days;
	}
	public String getTimes() {
		return times;
	}
	public void setTimes(String times) {
		this.times = times;
	}
	public String getTz() {
		return tz;
	}
	public void setTz(String tz) {
		this.tz = tz;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Rates [days=" + days + ", times=" + times + ", tz=" + tz + ", price=" + price + "]";
	}
}
