package direction;

import java.util.Scanner;

public class Addnumber {

	public static void main(String[] args) {
		System.out.println("Enter number...");
		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		int b = scanner.nextInt();
		String bred = scanner.nextLine();
		try{
			int c = a + b;
			System.out.println(c);
		}
		catch(Exception e){
			System.out.println("Insert a correct number");
		}

	}
}
