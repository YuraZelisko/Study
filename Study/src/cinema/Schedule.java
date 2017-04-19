package cinema;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Schedule {
	Set<Seance> seances;

	public Schedule() {
		super();
		this.seances = new TreeSet<Seance>();
	}

	public Set<Seance> getSeances() {
		return seances;
	}

	public void setSeances(Set<Seance> seances) {
		this.seances = seances;
	}

	@Override
	public String toString() {
		return seances.toString();
	}
	public void addSeance (){
		System.out.println("enter title, int duratiun hours/minutes, enter start hours/minutes");
		String title = Main.scanner.next();
		int hour = Main.scanner.nextInt();
		int min = Main.scanner.nextInt();
		int hourStart = Main.scanner.nextInt();
		int minStart = Main.scanner.nextInt();
		seances.add(new Seance(new Movie(title, (new Time(hour, min))), (new Time(hourStart, minStart))));
		System.out.println(seances);
	}
	public void removeSeances (){
		Iterator<Seance> iter = seances.iterator();
		  while(iter.hasNext())
		  {
		   if(iter.next().getMovie().getTitle().equalsIgnoreCase(seances.iterator().next().getMovie().getTitle())) //.iterator().next()
		   {
		    iter.remove();
		   }
		  }		System.out.println(seances);

	}
	
}
