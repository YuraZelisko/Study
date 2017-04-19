package cinema;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Cinema {
	
	TreeMap<Days, Schedule> map;
	Time open;
	Time close;
	public Cinema(Time open, Time close) { //TreeMap<Days, Schedule> map, Time open, Time close
		super();
		this.map = new TreeMap<Days, Schedule>();
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

	
	public void addDay(){
		System.out.println("Enter day");
		String dayName = Main.scanner.next().toUpperCase();
		for (Days day : Days.values()) {
			if(dayName.equalsIgnoreCase(day.name())){
				map.put(day, new Schedule());
				System.out.println(map);
			}
		}
	}
	
	
	public void addSchedule(){
		System.out.println("enter day of show");
		String newDay = Main.scanner.next().toUpperCase();
		Iterator<Entry<Days, Schedule>> iterator = map.entrySet().iterator();     //entrySet().iterator();
		while(iterator.hasNext()){
			Map.Entry<Days, Schedule> map = iterator.next();
			if(map.getKey().name().equals(newDay)){
				map.getValue().addSeance();
			}
		}	
			}

	public void addMovie(){
	}
	public void showWeek(){
		for(Map.Entry<Days, Schedule> entry : map.entrySet())
		System.out.println(entry);
	}

	public void menu(){
	while (true){
		System.out.println("enter 1 for add day\n"+ "enter 2 for add Schedule\n"+"enter 3 for add Movie\n" + 
	"enter 4 for show Week\n" +  "enter 5 for system exit\n");
		
	int key = Main.scanner.nextInt();
	switch (key) {

	case 1:{
		addDay();
		break;
	}
	case 2:{
		addSchedule();
		break;
	}
	case 3:{
		addMovie();
		break;
	}
	case 4:{
		showWeek();
		break;
	}
	case 5:{
		System.exit(1);
		break;
	}

	default:
		break;
	}
	
	}
	}
}
