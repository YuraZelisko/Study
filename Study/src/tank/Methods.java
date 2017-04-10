package tank;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class Methods {

	
	List <Car> cars = new ArrayList<Car>();
	File file = new File("tank.txt");
	
	public void addCar() throws IOException{
		System.out.println("Enter id");
		int id = Main.scanner.nextInt();
		if(cars.contains(id)){
			System.out.println("You already have such ID");
		}
		else{
			String name = UUID.randomUUID().toString().replaceAll("[^a-zA-Z]", "").toUpperCase().substring(0, 2);
			int year = 1920+(int)(Math.random()*100);
			int maxSpeed = 50+(int)(Math.random()*150);
			String model =UUID.randomUUID().toString().replaceAll("[^a-zA-Z]", "").toUpperCase().substring(0, 2);
			cars.add(new Car(id, name, year, maxSpeed, model));
			FileWriter fileWriter = new FileWriter(file,true);
			for (int i = 0; i < cars.size(); i++) {
				fileWriter.write(cars.get(i).toString()+"\n");
			}
			fileWriter.close();
		}			
		}
	public void showAll() throws IOException{
		 FileReader fileReader = new FileReader(file);
		  BufferedReader bufferedRead = new BufferedReader(fileReader);
		  String tmp;
		  while ((tmp = bufferedRead.readLine()) != null) {
			  System.out.println(tmp);
		  }
	}

	public void readScanner() throws IOException {
		FileReader fileReader = new FileReader(file);
		BufferedReader bufferedRead = new BufferedReader(fileReader);
		String tmp;
		while ((tmp = bufferedRead.readLine()) != null) {

			String[] array = (tmp.replaceAll("\\D+", " ").trim().split(" "));
			int[] newMassive = new int[array.length];
			int idNumber = 0;

			for (int i = 0; i < array.length; i++) {
				newMassive[i] = Integer.valueOf(array[i]);
				idNumber = newMassive[0];
				for (int j = 0; j < newMassive.length; j++) {
					newMassive[j] = idNumber;
				}

			}
			for (int j = 0; j < newMassive.length; j++) {
			}
			System.out.println(idNumber);
		}
		bufferedRead.close();
	}
	public void func() throws IOException{
		addCar();
		readScanner();

	}
}
