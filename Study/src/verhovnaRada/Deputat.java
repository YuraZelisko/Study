package verhovnaRada;

import java.util.Scanner;

public class Deputat extends Human{

	private String sename;
	private String name;
	private int age;
	private boolean habar;
	private int sizeHabar;
	
	
	
	public Deputat(int wight, int height, String sename, String name, int age, boolean habar) {
		super(wight, height);
		this.sename = sename;
		this.name = name;
		this.age = age;
		this.habar = habar;
	}
	public String getSename() {
		return sename;
	}
	public void setSename(String sename) {
		this.sename = sename;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isHabar() {
		return habar;
	}
	public void setHabar(boolean habar) {
		this.habar = habar;
	}

	
	public void giveHabar(){
		
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
	
		if(habar==true){
			System.out.println("take habar");
			System.out.println("Which size of braught you will give?");
			if(size>5000){
				System.out.println("police will arest deputat");
			}else{
				System.out.println("he escape with money");
			}
			
		}else{
			System.out.println("he is trufely");
		}
	}
	
	
}
