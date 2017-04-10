package cinema;

public class Time {
	
	int min;
	int hour;
	public Time(int min, int hour) {
		super();
		if(min>0 && min<60){
			this.min = min;
		}
		else{
			System.out.println("enter value between 0-60");
		}
		if(hour>0 && hour<24){
			this.hour = hour;
		}
		else{
			System.out.println("enter value between 0-24");
		}
		
	}
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	

}
