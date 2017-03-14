package verhovnaRada;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Fraction extends Deputat{
	
	
	private String frName;
	private int quantityDepts;
	private Deputat deputat;
	
	
	public Fraction(int wight, int height, String sename, String name, 
			int age, boolean habar, String frName,
			int quantityDepts, Deputat deputat) {
		super(wight, height, sename, name, age, habar);
		this.frName = frName;
		this.quantityDepts = quantityDepts;
		this.deputat = deputat;
	}
//	public Fraction(String frName, int quantityDepts, Deputat deputat) {
//		super(wight, height, sename, name, 
//				age, habar);
//		this.frName = frName;
//		this.quantityDepts = quantityDepts;
//		this.deputat = deputat;
//
//	}
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
		boolean habar = scanner.hasNextBoolean();
		Deputat deputat = new Deputat(weight, height, sename, name, age, habar);
		deputat.giveHabar();
		deputats.add(deputat);
	}
	public void removeDeputat(){
		String name = scanner.nextLine();
		String sename = scanner.nextLine();
		for (Deputat a : deputats){
			if(a.getName().equals(name) && a.getSename().equals(sename)){
				deputats.remove(a);
			}
			
		}

	}
	public void allCheaters(){
		for (Deputat a : deputats){
			if(a.isHabar()== true){
				System.out.println(a.getName() + " is briber");
			}
			else{
			System.out.println("Don`t take bribe");
			}
		}
	}
	public void heaveCheater(){
		for (Deputat a : deputats){
			if(a.isHabar()==true){
				int max = 0;
				if(a.giveHabar()<max){
					a.setsizeHabar(max);
					System.out.println("Most greedy deputat is "+a.getSename());
				}
			}
		}
	}
	public void allDeputats(){
		for (Deputat a : deputats){
			System.out.println(a);
		}
	}
	public void clearFraction(){
		deputats.removeAll(deputats);
		System.out.println("Goverment is clear from that evil");
		
	}

}
