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
		System.out.println("Enter name");
		String inputName = new Main().scanner.next();
		System.out.println("Enter age");
		int inputAge = new Main().scanner.nextInt();
		Person person = new Person(inputName, inputAge);
		

	}
}
