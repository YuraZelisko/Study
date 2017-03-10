package direction;

import java.util.Scanner;

public class Did {
	
	public static void main(String[] args) {
		System.out.println("Input a word at 5 letters...");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		if(name.charAt(0) == name.charAt(4)){
			if(name.charAt(1) == name.charAt(3)){
				System.out.println("word "+name+" is poliardrom");
			}
		}else{
		System.out.println(name + " isn`t poliardrom");
		}
	}

}
