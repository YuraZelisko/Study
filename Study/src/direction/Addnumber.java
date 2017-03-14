package direction;

import java.util.Scanner;

public class Addnumber {

	public static void main(String[] args) {
		System.out.println("Enter number...");
		Scanner scanner = new Scanner(System.in);
		
		boolean a0=scanner.hasNextInt();
		boolean b0 = scanner.hasNextInt();
		
		while (a0==true && b0==true){

		int a = scanner.nextInt();
		int b = scanner.nextInt();

			int c = a + b;
			System.out.println(c);
		if(a0==false){
			System.out.println("input only numbers");
		}
		else if(b0==false){
			System.out.println("input only numbers");
		}
		else;
		}
	}
}
