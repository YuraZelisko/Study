package robot;

import java.util.Scanner;

public class Human {
	
	String name;
	int age;
	String type;
	Scanner sc = new Scanner(System.in);
	String HumanName = sc.nextLine();
	
	public Human(String name, int age, String type) {
		super();
		this.name = name;
		this.age = age;
		this.type = type;
	}
	void typeOf(){
		System.out.println("Choose type between hunter or gatherer");
		if(type.equals(HumanName)){
			System.out.println("this is hunter");
		}else{
			System.out.println("this is gatherer");
		}
	
	}
	void canEat(){
		if (type.equals(HumanName)){
			System.out.println("hunter can reat 2kg meat");
		}else{
			System.out.println("gatherer can reat 2kg vegetables");
		}
	}
	
	
}
