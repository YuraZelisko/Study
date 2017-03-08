package calendar;

import java.util.Scanner;

import enumer.Trasport;

public class Main {


	public static void main(String[] args) {
		

		
		Month [] months = Month.values();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Insert month...");
		
		String userMonth = scanner.next();
		
		for (int i = 0; i < months.length; i++) {
			
		if(scanner.equals(months[i].name())){

		}
		
		}
		
	}

}
