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
	private List <Person> persons = new ArrayList<>(Main.capasity);
		public MyQueue() {

	}

	@Override
	public boolean offer(Person person) {
		System.out.println("Enter capasity");
			  if(size()<Main.capasity){
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
	
	public void comper(){
		String name = UUID.randomUUID().toString().replaceAll("[^a-zA-Z]", "").toUpperCase().substring(0, 2);
		int age = 16 + (int) (Math.random() * 90);
		sortByAge();
		persons.remove(persons.size()-1);
		persons.add(new Person(name, age));
		sortByAge();
//		int middle = persons.get(0).getAge();
//		for (int i=0; i < persons.size()-1; i++) {
//
//			if(persons.get(i).getAge()> middle){
//				middle = persons.indexOf(persons.get(i));
//				middle = middle +  persons.indexOf(persons.get(i));
//
//			}
//			
//			else {
//				middle = persons.get(i).getAge(); 
//
//			}
//			
//				middle = persons.get(i).getAge();
//				for (int i=0; i<persons.size(); i++) {
//				if(persons.get(i).getAge()>middle){
//					middle = persons.get(i).getAge();
//					persons.get(i).getAge() = persons.get(i+1).getAge();
//				}
//		}
//			}
//		}
		
	}
	
	public void menu(){
		boolean work;
		while (true){
		System.out.println("Enter 1 for offer");
		System.out.println("Enter 2 for peek");
		System.out.println("Enter 3 for poll");
		System.out.println("Enter 4 for size");
		System.out.println("Enter 5 for showAllPersons");
		System.out.println("Enter 6 for sortByAge");
		System.out.println("Enter 7 for comper");
		System.out.println("Enter 8 for exit");
		
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
			comper();
			break;
		}
		case 8: {
			System.out.println("Exit program");
			System.exit(0);
		}

		default:
			break;
		}
	
		}
	}
}
