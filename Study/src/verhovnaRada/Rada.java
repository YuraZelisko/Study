package verhovnaRada;

import java.util.ArrayList;
import java.awt.List;
import java.util.Scanner;

public class Rada extends Fraction{
	
	private int numbOfFraction;
	private Fraction fraction;
	Scanner scanner = new Scanner(System.in);
	ArrayList<Fraction> verhRada = new ArrayList<Fraction>();
	
	public Rada(int wight, int height, String sename, String name, int age, 
			boolean habar, String frName,int quantityDepts, Deputat deputat, int numbOfFraction, 
			Fraction fraction) {
		super(wight, height, sename, name, age, habar, frName, quantityDepts, deputat);
		this.numbOfFraction = numbOfFraction;
		this.fraction = fraction;
	}
	
	

	public int getNumbOfFraction() {
		return numbOfFraction;
	}



	public void setNumbOfFraction(int numbOfFraction) {
		this.numbOfFraction = numbOfFraction;
	}



	public Fraction getFraction() {
		return fraction;
	}



	public void setFraction(Fraction fraction) {
		this.fraction = fraction;
	}



	public void addFraction(){
		int numbOfFraction = scanner.nextInt();
		String fraction = scanner.next();
		addDeputat();
	}
	public void removeFraction(){
		String name = scanner.nextLine();
		for (Fraction a : verhRada){
			if(a.getFrName().equals(name)){
				verhRada.remove(a);
			}
		}
	}
	public void showAllFractions(){
		for (Fraction a : verhRada){
			System.out.println(a.getFrName());
		}
	}
	public void showCurrFraction(){
		String name = scanner.nextLine();
		for (Fraction a : verhRada){
			if(a.getFrName().equals(name)){
				System.out.println(a);
			}
		}
	}
	public void addDeptToCurrFract(){
		
	}
	public void removeDept(){
		String frName = scanner.nextLine();
		String name = scanner.nextLine();
		String sename = scanner.nextLine();
		for (Fraction b : verhRada){
			if(b.getFrName().equals(frName)){
				for (Deputat a : deputats){
					if(a.getName().equals(name) && a.getSename().equals(sename)){
						deputats.remove(a);
					}
					
				}
			}
		}
	}
	public void showTakersFraction(){
		for (Fraction b : verhRada){
		for (Deputat a : deputats){
			if(a.isHabar()== true){
				System.out.println(b.getFrName()+" "+a.getName() + " is briber");
			}
			else{
			System.out.println("Don`t take bribe");
			}
		}}
	}
	public void showChamp(){
		for (Fraction b : verhRada){
		for (Deputat a : deputats){
			if(a.isHabar()==true){
				for(Deputat c : deputats){
				int max = 0;
				if(c.giveHabar()<max){
					max = c.giveHabar();
					System.out.println("Most greedy deputat is "+b.getFrName()+" "+c.getSename());
				}
			}}
		}}
	}
	public void showAllDept(){
		for (Fraction a : verhRada){
			String name = scanner.nextLine();
			if(a.getFrName().equals(name)){
				for(Deputat b : deputats){
				System.out.println(b.getSename());
				}
			}
		}
	}

}
