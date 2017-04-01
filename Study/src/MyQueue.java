import java.security.Permissions;
import java.util.AbstractQueue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.UUID;

public class MyQueue  extends AbstractQueue<Person>{
//	System.out.println("Enter capasity");
	Scanner scanner = new Scanner(System.in);
	private List <Person> persons = new ArrayList<>(scanner.nextInt());
		public MyQueue() {

	}

	@Override
	public boolean offer(Person person) {
		System.out.println("enter size");
			  if(size()<scanner.nextInt()){
				  String name = UUID.randomUUID().toString().replaceAll("[^a-zA-Z]", "").toUpperCase().substring(0, 2);
				  int age = 16 + (int) (Math.random() * 90);
				  persons.add(new Person(name, age));
				  showAllPersons();
			}
			  else{
				  poll();
				  offer(person);
				  }
			  return true;
	}

	@Override
	public Person peek() {
		System.out.println(persons.get(0));
		return persons.get(0);
	}

	@Override
	public Person poll() {
		
		return persons.remove(0);
	}

	@Override
	public Iterator<Person> iterator() {
		
		return null;
	}

	@Override
	public int size() {
		
		return persons.size();
	}
	
	public void showAllPersons(){
		Iterator<Person> iter = persons.iterator();
		while (iter.hasNext()){
			System.out.println(iter.next());
		}
	}
	public void sortByAge(){
		Collections.sort(persons, new SortByYear());
	}
	
	public void menu(){
		boolean work;
		while (true){
		System.out.println("Enter 1 for offer");
		System.out.println("Enter 2 for peek");
		System.out.println("Enter 3 for poll");
		System.out.println("Enter 4 for iterator");
		System.out.println("Enter 5 for size");
		System.out.println("Enter 6 for showAll");
		System.out.println("Enter 7 for sort by age");
		
		int input = Main.scanner.nextInt();

		
		switch (input) {
		case 1:{
			 
			offer(new Person("olga", 22));
			break;}
		case 2: {
			peek();
			break;
		}
		case 3: {
			poll();
			break;
		}
		case 4: {
			size();
			break;
		}
		case 5: {
			showAllPersons();
			break;
		}
		case 6: {
			sortByAge();
			break;
		}
		case 7: {
			System.out.println("Exit program");
			System.exit(0);
		}

		default:
			break;
		}
	
		}
	}
}
