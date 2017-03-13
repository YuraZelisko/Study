package year;

import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Month [] month = Month.values();
		String input = scanner.nextLine();
		boolean exist = false;
		
					System.out.println("Insert month");
		
		for (int j = 0; j < month.length; j++) {
				if(input.equalsIgnoreCase(month[j].name())){
					System.out.println(input + " is avalible");
					System.out.println(" ");
					System.out.println("All months with same season...");
					for (int i = 0; i < month.length; i++) {
						if(month[j].getSeason().equals(month[i].getSeason())){
							System.out.println(month[i].name());
						}
					}
					System.out.println(" ");
					System.out.println("Month days equals...");
					for (int i = 0; i < month.length; i++) {
						if(month[j].getDay()==month[i].getDay()){
							System.out.println(month[i]);
						}
					}
					System.out.println(" ");
					System.out.println("Month days less than input...");
					for (int i = 0; i < month.length; i++) {
						if(month[i].getDay()<month[j].getDay()){
							System.out.println(month[i]);
						}
					}
					System.out.println(" ");
					System.out.println("Month days grow than input...");
					for (int i = 0; i < month.length; i++) {
						if(month[j].getDay()<month[i].getDay()){
							System.out.println(month[i]);
						}
					}
					System.out.println(" ");
					System.out.println("Next season...");
					for (int i = 0; i < month.length; i++) {
						if(month[j].getSeason().equals(month[i].getSeason())){
							System.out.println(month[i+3].getSeason());break;
						}
					}
					System.out.println(" ");
					System.out.println("Previos season...");
					for (int i = 0; i < month.length; i++) {
						if(month[j].getSeason().equals(month[i].getSeason())){
							System.out.println(month[i-1].getSeason());
							break;
						}
					}
					System.out.println(" ");
					System.out.println("Pariry month ?...");
					for (int i = 0; i < month.length; i++) {
						if((month[j].getDay()%2==0)){
							System.out.println(month[j]+" month is Parity");break;
						}else {
							System.out.println(month[j]+" month is Non parity");break;
					}
				}
					System.out.println(" ");
					System.out.println("You see parirty months...");
					for (int i = 0; i < month.length; i++) {
						if((month[i].getDay()%2==0)){
							System.out.println(month[i]+" parity month");
						}}
					System.out.println(" ");
					System.out.println("You see Non parirty months...");
					for (int i = 0; i < month.length; i++) {
							if((month[i].getDay()%2!=0)){
							System.out.println(month[i]+" non parity month");
							}
					}
					exist = true;
					break;
				}
			}
		if(exist==false){
			System.out.println("uncorrect month name");

		}
	} 
}

