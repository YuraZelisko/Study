package verhovnaRada;

import java.util.ArrayList;
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




	public void addFraction(){
		int numbOfFraction = scanner.nextInt();
		String fraction = scanner.next();
		addDeputat();
//		verhRada.add(0, new Fraction(80, 180, "dsfss", "sdfsd", 50, true, getName(), 15, 
//				new Deputat(40, 150, "dssdf", "fdsw", 20, false)));
	}

}
