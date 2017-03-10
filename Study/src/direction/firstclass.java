package direction;

import java.util.Scanner;

public class firstclass {

	public static void main(String[] args) {
		
		System.out.println("Enter a number...");
		Scanner scanner = new Scanner(System.in);
		int numb = scanner.nextInt();
		
		if(numb %2 == 0){
			System.out.println("number "+numb+" is parity number");
			
		}else{
			System.out.println("number "+numb+" is oddnes number");
		}

	}Scanner close;

	

}
