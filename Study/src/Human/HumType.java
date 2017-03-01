package Human;

import java.util.Scanner;

public class HumType {
	
	Scanner scanner = new Scanner(System.in);
	
	Dishes dishes [] = {new Dishes("salat"), new Dishes("chiken"), 
			new Dishes("goat"), new Dishes("boar")};
	
	Human Toxa = new Human("Anton", 22, "hunter");
	Human Vitaxa = new Human("Vitalik", 17, "gather");

	for (int i = 0; i < dishes.length; i++){
		if(i > (dishes.length/2)){
			if(dishes[i].equals(scanner)){
			
		System.out.println(Toxa.getType()+"`s food");
			}else;
		}
		else if(i<=(dishes.length/2)){
			if(dishes[i].equals(scanner)){
				System.out.println(Vitaxa.getType()+"`s food");
			}
			else;

				
	}else;
	
	
	Scanner close;
	

}
}
}
