package direction;

import java.util.Scanner;

public class firstclass {

	public static void main(String[] args) {
		
		System.out.println("Enter a number...");
		Scanner scanner = new Scanner(System.in);
		boolean numb0 = scanner.hasNextInt();
		
		while (numb0==true){
			int numb = scanner.nextInt();
		
			if(numb %2 == 0){
				System.out.println("number "+numb+" is parity number");
			
			}else{
				System.out.println("number "+numb+" is oddnes number");
			}
			}
			if(numb0==false){
				System.out.println("Input only numbers");
			}

	}Scanner close;

	

}
