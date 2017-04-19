package cinema;

public class Seance implements Comparable<Seance>{
	Movie movie;
	Time startTime;
	Time endTime;
	

	public Seance(Movie movie, Time startTime) {
		super();
		this.movie = movie;
		this.startTime = startTime;
		this.endTime = new Time(startTime.getHour()+movie.getDuration().getHour(), 
				startTime.getMin()+movie.getDuration().getMin());
	}
	public Movie getMovie() {
		return movie;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	public Time getStartTime() {
		return startTime; 
	}
	public void setStartTime(Time startTime) {
		this.startTime = startTime;
	}
	public Time getEndTime() {
		return endTime;
	}
	public void setEndTime(Time endTime) {
		this.endTime = endTime; 
	}
	@Override
	public String toString() {
		if(getEndTime().getMin() > 59)
		   {
		    int hours = getEndTime().getHour();
		    int mins = getEndTime().getMin();
		    hours = hours + 1;
		    mins = mins - 60;
		    setEndTime(new Time(hours, mins));
		   }
		return "Seance [movie=" + movie + ", startTime=" + startTime + ", endTime=" + endTime + "]";
	}
	@Override
	public int compareTo(Seance o) {
		if(!this.startTime.equals(startTime)){
			
			return -1;
		}else{return 1;}
		
	}
	 
	
}
