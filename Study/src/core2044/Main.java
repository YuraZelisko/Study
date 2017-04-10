package core2044;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		Person<String, Integer> person = new Person<>("olga", 23);
		
		Person<Integer, Double> person2 = new Person<Integer, Double>(123, 12.4);
		
		List <Person> list = new ArrayList<>();
		
		list.add(person);
		list.add(person2);
		
		double suma = 0;
	//	if (person.getName().getClass().getSimpleName().equals("Number")){
		for (Person person3 : list) {
		//	if(person.getName() instanceof Number ){
			
		}
			
				
		
		
		suma = person.getAge()+person2.getAge()+person2.getName();
		System.out.println(suma);
		
		

	}

}
