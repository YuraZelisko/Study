package direction;

import java.util.Scanner;

public class Did {
	
	public static void main(String[] args) {
		System.out.println("Input a word at 5 letters...");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		String name2 = null;
		name2=name;
		name2.toLowerCase();
		if(name2.charAt(0) == name2.charAt(4) && name2.charAt(1) == name2.charAt(3)){
				System.out.println("word "+name2.toLowerCase()+" is poliardrom");
		}
		else{
				System.out.println(name + " isn`t poliardrom");
		}
	}

}
