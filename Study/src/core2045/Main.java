package core2045;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("persons.txt"));
		
		Person person1 = new Person("Vanya", 12);
		Person person2 = new Person("Vasya", 22);
		Person person3 = new Person("Vitya", 32);
		Person person4 = new Person("Vitalik", 42);
		Person person5 = new Person("Vika", 52);
		
//		
		objectOutputStream.writeObject(person1);
		objectOutputStream.writeObject(person2);
		objectOutputStream.writeObject(person3);
		objectOutputStream.writeObject(person4);
		objectOutputStream.writeObject(person5);
		
		
		ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("persons.txt"));
		 
		Person maxAge = (Person) inputStream.readObject();
		try {
			while(true){	
				Person p = (Person)inputStream.readObject();
				
				System.out.println(inputStream.readObject());
				for (int i = 0; i < 5; i++) {
				}
			}
		} catch (EOFException e) {
			
		}
		objectOutputStream.close();

	}

}
