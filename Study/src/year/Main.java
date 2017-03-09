package year;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Month [] month = Month.values();
		String input = scanner.nextLine();
		boolean exist = false;
		
		for (int j = 0; j < month.length; j++) {
				if(input.equalsIgnoreCase(month[j].name())){
					System.out.println(input + " that month avalible");
					exist = true;
					break;
				}
			}
		if(exist==false){
			System.out.println("uncorrect month name");
		}
	} 
}
