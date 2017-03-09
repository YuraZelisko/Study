package stringNumb;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Insert string");
		
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next(); //"dsfkj30sdf 0d9s8f32l sd32 es4";
		String cutS = s.replaceAll("\\D+", "_");
		String [] newCut = cutS.split("_");
		long[] maxValue = new long [newCut.length];//Integer.parseInt(newCut[]);
		long maxMax = 0;
		for (int j = 0; j < newCut.length; j++) {
			try{
				maxValue [j]=Long.parseLong(newCut[j]);
			}catch (NumberFormatException dfgdf) {}
			
			for (int i = 0; i < maxValue.length; i++) {
				if(maxMax<maxValue[i]){
					maxMax=maxValue[i];
				}
			}
		}
		System.out.println(maxMax);
	}Scanner close;

}
