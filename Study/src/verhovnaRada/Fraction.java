package verhovnaRada;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Fraction {
	
	ArrayList<Deputat> deputats = new ArrayList<Deputat>(); 
	Scanner scanner = new Scanner(System.in);
	
	public void addDeputat(){
		System.out.println("Enter name");
		String name = scanner.next();
		System.out.println("Ente weight");
		int weight = scanner.nextInt();
		int height = scanner.nextInt();
		String sename = scanner.next();
		int age = scanner.nextInt();
		boolean habar = scanner.hasNextByte();
		Deputat deputat = new Deputat(weight, height, sename, name, age, habar);
		deputat.giveHabar();
		deputats.add(deputat);
	}
	public void removeDeputat(){
		String name = scanner.nextLine();
		String sename = scanner.nextLine();
		for (Deputat a : deputats){
			if(a.equals(name) && a.equals(sename)){
				deputats.remove(a);
			}
			
		}

	}
	public void allCheaters(){
		for (Deputat a : deputats){
			if(a.equals(Deputat)){
				
			}
		}

	}
	public void heaqveCheater(){
		
	}
	public void allDeputats(){
		
	}
	public void clearFraction(){
		
	}

}
