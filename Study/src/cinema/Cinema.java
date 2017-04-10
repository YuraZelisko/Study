package cinema;

import java.time.DayOfWeek;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Cinema {
	
	TreeMap<Days, Schedule> map;
	Time open;
	Time close;
	Set<Entry<Days, Schedule>> set;
	public Cinema() { //TreeMap<Days, Schedule> map, Time open, Time close
		super();
		this.map = map;
		this.open = open;
		this.close = close;
	}
	public TreeMap<Days, Schedule> getMap() {
		return map;
	}
	public void setMap(TreeMap<Days, Schedule> map) {
		this.map = map;
	}
	public Time getOpen() {
		return open;
	}
	public void setOpen(Time open) {
		this.open = open;
	}
	public Time getClose() {
		return close;
	}
	public void setClose(Time close) {
		this.close = close;
	}
	@Override
	public String toString() {
		return "Cinema [map=" + map + ", open=" + open + ", close=" + close + "]";
	}
	
	Schedule schedule = new Schedule();
//	Seance seance = new Seance(movie, startTime);
	
	public void addDay(){
		System.out.println("Enter day");
		String dayName = Main.scanner.next();
		for (Days day : Days.values()) {
			if(day.name().equalsIgnoreCase(dayName)){
				map.put(day, schedule);
			}
			else {
				System.out.println("Day is not correct");
				break;
			}
		}
	}
	
	
	public void addSchedule(){
		System.out.println("enter day of show");
		String newDay = Main.scanner.next();
//		for (Entry<Days, Schedule> entry : set) {
//			while (!entry.equals(null)){
////				Entry<Days, Schedule> entry2 = iterator.next();
//				if(newDay.equals(entry.getKey().toString())){
//					entry.getValue().addSeance();
//		}
//		Iterator<Entry<Days, Schedule>> iterator = set.iterator().next().getKey().ge;
//		while (iterator.hasNext()){
			Entry<Days, Schedule> entry = (Entry<Days, Schedule>) set;
			if(newDay.equals(entry.getKey().getClass().getName())){
				entry.getValue().addSeance();
			}
		}
	
	
	
	public void addMovie(){
		
	}
	
	
	
	public void menu(){
	while (true){
		System.out.println("enter 1 for add seance \n"+ "enter 2 for remove seance\n" + "enter 3 for add day\n"
				+ "enter 4 for add movie\n"+"enter 5 for add schedule\n" + "enter 6 for system exit");
		
	int key = Main.scanner.nextInt();
	Schedule schedule = new Schedule();
	switch (key) {
	case 1:{
		schedule.addSeance();
		break;
	}
	case 2:{
		schedule.removeSeances();
		break;
	}
	case 3:{
		addDay();
		break;
	}
	case 4:{
		addMovie();
		break;
	}
	case 5:{
		addSchedule();
		break;
	}
	case 6:{
		System.exit(1);
		break;
	}

	default:
		break;
	}
	
	}
	}
	
	

}
