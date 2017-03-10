package year;

public enum Month{
	JANUARY(Season.WINTER, 31), FERBRUARY(Season.WINTER, 28), MARCH(Season.SPRING, 31), 
	APRIL(Season.SPRING, 30), MAY(Season.SPRING, 31), JUNE(Season.SUMMER, 30), 
	JULY(Season.SUMMER, 31), AUGUST(Season.SUMMER, 31), SEPTEMBER(Season.AUTUMN, 30), 
	OCTOUBER(Season.AUTUMN,31), NOVEMBER(Season.AUTUMN, 30), DECEMBER(Season.WINTER, 31);
	
	Season season;
	int day;
	private Month(Season season, int day) {
		this.season = season;
		this.day = day;
	}
	public Season getSeason() {
		return season;
	}
	public void setSeason(Season season) {
		this.season = season;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	
	
}
