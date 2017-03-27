package commodity;

public class Auto {
	private String brend;
	private int year;
	public Auto(String brend, int year) {
		super();
		this.brend = brend;
		this.year = year;
	}
	public String getBrend() {
		return brend;
	}
	public void setBrend(String brend) {
		this.brend = brend;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Auto [brend=" + brend + ", year=" + year + "]";
	}
	
}
