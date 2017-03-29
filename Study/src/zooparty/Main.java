package zooparty;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		
	
		Map map = new HashMap<>();
		
		System.out.println("Enter 1 for add Person");
		System.out.println("Enter 2 for add Pet fo Person");
		System.out.println("Enter 3 for remove Pet from Person");
		System.out.println("Enter 4 for remove Person");
		System.out.println("Enter 5 for remove a currect Pet from all");
		System.out.println("Enter 6 for show all");
		System.out.println("Enter 7 exit program");
		
		String key = scanner.next();
		
		switch (key) {
		case "1":{
			
			break;}
		case "2": {

			break;
		}
		case "3": {

			break;
		}
		case "4": {

			break;
		}
		case "5": {

			break;
		}
		case "6": {

			break;
		}
		case "7": {
			System.exit(1);

			break;}

		default:
			break;
		}
		
		
	}

}
