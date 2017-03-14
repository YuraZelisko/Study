package verhovnaRada;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		Rada rada = new Rada();

		rada.addFraction();
		rada.addAnDeputyToConcreteFraction();
		rada.addAnDeputyToConcreteFraction();
		rada.showAllBribersInFraction();

	
		
//		System.out.println("Input 1  to add fraction");
//		System.out.println("Input 2  to remove fraction");
//		System.out.println("Input 3  to clear fraction");
//		System.out.println("Input 4  to show fractions");
//		System.out.println("Input 5  to show fraction");
//		System.out.println("Input 6  to add Deputat in fraction");
//		System.out.println("Input 7  to remove Deputat of fraction");
//		System.out.println("Input 8  to show list of takers");
//		System.out.println("Input 9  to show most bribe taker");
//		
//		Scanner sc = new Scanner(System.in);
//		String key = sc.next();
		
//		switch (key) {
//		case "1":{
//			depik.addFraction();
//		}
//			break;
//		case "2":{
//			depik.removeFraction();
//		}
//			break;
//		case "3":{
//			depik.clearFraction();
//		}
//			break;
//		case "4":{
//			depik.showAllFractions();
//		}
//			break;
//		case "5":{
//			depik.showCurrFraction();
//		}
//			break;
//		case "6":{
//			depik.addDeptToCurrFract();
//		}
//			break;
//		case "7":{
//			depik.removeDept();
//		}
//			break;
//		case "8":{
//			depik.showTakersFraction();
//		}
//			break;
//		case "9":{
//			depik.showChamp();
//		}
//			break;
//		default:
//			break;
//		}

	
	}
}
