package zooparty;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ZooClub {
	
	public Map <Person, List<Animal>> map; //= new HashMap<>();

	public ZooClub(Map<Person, List<Animal>> map) {
		super();
		this.map = map;
	}

	public Map<Person, List<Animal>> getMap() {
		return map;
	}

	public void setMap(Map<Person, List<Animal>> map) {
		this.map = map;
	}

	public void addPerson(){
		String input = new Main().scanner.next();

	}
}
