package tovar;

import java.util.Collection;
import java.util.Formatter;
import java.util.Scanner;

public class Main {
	

	public static void main(String[] args) {
		
		Commands command = new Commands();
		Scanner scanner = new Scanner(System.in);
		boolean work = true;
		Formatter formatter = new Formatter();
	
		while (work){
			
		System.out.println("Press 1 for add");
		System.out.println("Press 2 for sort price higher");
		System.out.println("Press 3 for sort price lower");
		System.out.println("Press 4 for show page");
		String input = scanner.next();


				switch (input) {
				case "1":
					for (int i=0; i<100; i++){
						command.addCommodity();
					}
					
					break;
				case "2":
					command.sort_by_price_higher();
					
					break;
				case "3":
					command.SortByLowerPrice();
	
					break;
				case "4":{
					System.out.println("Enter page");
					String page = scanner.next();
					switch (page){
					  case "1": {
						  	
//						  	 System.out.printf("%3%3%3");
//						     System.out.print(command.commodities.subList(0, 8));
//						     System.out.println("\n{1} 2 3 4 5 6 7 8 9 10");
//						     break;
//						     System.out.print(formatter.format("%5s %5s %5s %5s %5s", "Title*", "Title*", "Title*", "Title*", "Title*"));
//						     for (int i = 0; i < 5; i++) {
//						             formatter = new Formatter();
//						             String rowData = "info" + i;
//						             System.out.print(formatter.format("%5s %5s %5s %5s %5s", command.commodities.subList(0, 8), 
//						            		 command.commodities.subList(9, 17), command.commodities.subList(18, 27), command.commodities.subList(28, 37), 
//						            		 command.commodities.subList(38, 47)));
//						    }
						  System.out.printf("%-10s %-10s %-10s\n", command.commodities.subList(0, 8).toString(), "two", "thredsfe");  
						   }
					
					  
						    case "2": {
						     System.out.print(command.commodities.subList(9, 17));
						     System.out.println("\n1 {2} 3 4 5 6 7 8 9 10");
						     break;
						    }
						    case "3": {
						     System.out.print(command.commodities.subList(18, 27));
						     System.out.println("\n1 2 {3} 4 5 6 7 8 9 10");
						     break;
						    }
						    case "4": {
						     System.out.print(command.commodities.subList(28, 37));
						     System.out.println("\n1 2 3 {4} 5 6 7 8 9 10");
						     break;
						    }
						    case "5": {
						     System.out.print(command.commodities.subList(38, 47));
						     System.out.println("\n1 2 3 4 {5} 6 7 8 9 10");
						     break;
						    }
						    case "6": {
						     System.out.print(command.commodities.subList(48, 57));
						     System.out.println("\n1 2 3 4 5 {6} 7 8 9 10");
						     break;
						    }

						    case "7": {
						     System.out.print(command.commodities.subList(58, 67));
						     System.out.println("\n1 2 3 4 5 6 {7} 8 9 10");
						     break;
						    }
						    case "8": {
						     System.out.print(command.commodities.subList(68, 77));
						     System.out.println("\n1 2 3 4 5 6 7 {8} 9 10");
						     break;
						    }
						    case "9": {
						     System.out.print(command.commodities.subList(78, 87));
						     System.out.println("\n1 2 3 4 5 6 7 8 {9} 10");
						     break;
						    }
						    case "10": {
						     System.out.print(command.commodities.subList(88, 100));
						     System.out.println("\n1 2 3 4 5 6 7 8 9 {10}");
						     break;
						    }
					}
	
					break;
					
				}
				
	
		
	
				default:
					break;
				}
		}
		System.exit(0);

	}

}
