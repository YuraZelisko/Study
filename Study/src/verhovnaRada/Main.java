package verhovnaRada;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Rada> fractionUnion = new ArrayList<Rada>();
		Rada union = new Rada(80, 180, "Aivazov", "Petro", 55, true, "BPP", 30, new Deputat
				(80, 180, "Aivazov", "Petro", 55, true), 3, new Fraction(80, 180, "Aivzov", 
						"Petro", 55, true, "BPP", 30, new Deputat(80, 150, "Aivazov", 
								"Petro", 55, true)));
		
		System.out.println("Input 1  to add fraction");
		System.out.println("Input 2  to remove fraction");
		System.out.println("Input 3  to clear fraction");
		System.out.println("Input 4  to show fractions");
		System.out.println("Input 5  to show fraction");
		System.out.println("Input 6  to add Deputat in fraction");
		System.out.println("Input 7  to remove Deputat of fraction");
		System.out.println("Input 8  to show list of takers");
		System.out.println("Input 9  to show most bribe taker");
		
		Scanner sc = new Scanner(System.in);
		String key = sc.next();
		
		switch (key) {
		case "1":{
			union.addFraction();
		}
			break;
		case "2":{
			union.removeFraction();
		}
			break;
		case "3":{
			union.clearFraction();
		}
			break;
		case "4":{
			union.showAllFractions();
		}
			break;
		case "5":{
			union.showCurrFraction();
		}
			break;
		case "6":{
			union.addDeptToCurrFract();
		}
			break;
		case "7":{
			union.removeDept();
		}
			break;
		case "8":{
			union.showTakersFraction();
		}
			break;
		case "9":{
			union.showChamp();
		}
			break;
		default:
			break;
		}

	}

}
