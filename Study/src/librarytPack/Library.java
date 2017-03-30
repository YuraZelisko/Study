package librarytPack;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Library {

	
	private Map <Author, List<Book>> map = new HashMap<>();
	private Set<Entry<Author, List<Book>>> set = map.entrySet();
	
	public Set<Entry<Author, List<Book>>> getSet() {
		return set;
	}
	public void setSet(Set<Entry<Author, List<Book>>> set) {
		this.set = set;
	}
	
	public void add_author(){
		System.out.println("Enter author name");
		String name = Main.scanner.next();
		System.out.println("Enter author last name");
		String lastName = Main.scanner.next();
		int height = 160+ (int) (Math.random()*40);
		int weight = 40+ (int) (Math.random()*60);
		int age = 18 + (int) (Math.random()*50);
		
		Author author = new Author(height, weight, age, name, lastName);
		
		map.put(new Author(height, weight, age, name, lastName), new ArrayList<Book>());
	}
	
	public void add_book_to_author(){
		System.out.println("Enter author name");
		String name = Main.scanner.next();
		System.out.println("Enter author last name");
		String lastName = Main.scanner.next();
		
		Iterator<Entry<Author, List<Book>>> iterator = set.iterator(); 
		while (iterator.hasNext()){
			Entry<Author, List<Book>> entry = iterator.next();
			if(entry.getKey().getName().equalsIgnoreCase(name)){
				System.out.println("Enter book tittle");
				String bookName = Main.scanner.next();
				int yearCreate = 1950+ (int) (Math.random()*100);
				int pagesQuantity = 100+ (int) (Math.random()*1000);
				entry.getValue().add(new Book(bookName, yearCreate, pagesQuantity));
			}
		}
	}
	public void removeBookFromAuthor(){
		System.out.println("Enter author name");
		String name = Main.scanner.next();
		System.out.println("Enter author last name");
		String lastName = Main.scanner.next();
		
		Iterator<Entry<Author, List<Book>>> iterator = set.iterator(); 
		while (iterator.hasNext()){
			Entry <Author, List<Book>> entry = iterator.next();
			if(entry.getKey().getName().equalsIgnoreCase(name) && entry.getKey().getLastName().
					equalsIgnoreCase(lastName)){
				System.out.println("Enter book tittle");
				String bookName = Main.scanner.next();
				Collection<Book> books = entry.getValue();
				Iterator<Book> iterator2 = books.iterator();
				while (iterator2.hasNext()) {
					Book book = iterator2.next();
					if(book.getBookName().equalsIgnoreCase(bookName)){
						iterator2.remove();
					}
					else {
						System.out.println("we haven`t such author");
					}
				}
			}
		}
	}
	public void removeAuthorWithAllBooks(){
		System.out.println("Enter author name");
		String name = Main.scanner.next();
		System.out.println("Enter author last name");
		String lastName = Main.scanner.next();
		
		Iterator<Entry<Author, List<Book>>> iterator = set.iterator(); 
		while (iterator.hasNext()){
			Entry <Author, List<Book>> entry = iterator.next();
			if(entry.getKey().getName().equalsIgnoreCase(name) 
					&& entry.getKey().getLastName().equalsIgnoreCase(lastName)){
				iterator.remove();
			}
		}
	}
	
	public void deleteAllBooksfromAuthor(){
		System.out.println("Enter author name");
		String name = Main.scanner.next();
		System.out.println("Enter author last name");
		String lastName = Main.scanner.next();
		
		Iterator<Entry<Author, List<Book>>> iterator = set.iterator(); 
		while (iterator.hasNext()){
			Entry <Author, List<Book>> entry = iterator.next();
			if(entry.getKey().getName().equalsIgnoreCase(name) &&
					entry.getKey().getLastName().equalsIgnoreCase(lastName)){
				while (iterator.hasNext()){
				entry.getValue().remove(iterator.next());
			}
			}
		}
	}
	public void sortByYear(){
		System.out.println("Enter author name");
		String name = Main.scanner.next();
		System.out.println("Enter author last name");
		String lastName = Main.scanner.next();
		
		Iterator<Entry<Author, List<Book>>> iterator = set.iterator(); 
				
		while (iterator.hasNext()){
			Entry <Author, List<Book>> entry = iterator.next();
			if(entry.getKey().getName().equalsIgnoreCase(name) &&
					entry.getKey().getLastName().equalsIgnoreCase(lastName)){
				List<Book> books = entry.getValue();
				Collections.sort(books, new SotrByYear());
		}}
	}
	
	public void sortByPage(){
		System.out.println("Enter author name");
		String name = Main.scanner.next();
		System.out.println("Enter author last name");
		String lastName = Main.scanner.next();
		
		Iterator<Entry<Author, List<Book>>> iterator = set.iterator(); 
				
		while (iterator.hasNext()){
			Entry <Author, List<Book>> entry = iterator.next();
			if(entry.getKey().getName().equalsIgnoreCase(name) &&
					entry.getKey().getLastName().equalsIgnoreCase(lastName)){
				List<Book> books = entry.getValue();
				Collections.sort(books, new SortByPages());
		}}
	}
	
	
	public void showAllbooks(){
		Iterator<Entry<Author, List<Book>>> iterator = set.iterator(); 
		while (iterator.hasNext()) {
		System.out.println(iterator.next());
	}
	
}
	public void menuShow(){
		boolean work =true;
		while (work){
		   System.out.println("Enter 1 for add_author");
		   System.out.println("Enter 2 for add_book_to_author");
		   System.out.println("Enter 3 for removeBookFromAuthor");
		   System.out.println("Enter 4 for removeAuthorWithAllBooks");
		   System.out.println("Enter 5 for deleteAllBooksfromAuthor");
		   System.out.println("Enter 6 for sortByYear");
		   System.out.println("Enter 7 for sortByPage");
		   System.out.println("Enter 8 for showing all library");
		   System.out.println("Enter 9 for exit");
		   
		   
		   int key = Main.scanner.nextInt();
			
			switch (key) {
			case 1:{
				add_author();
				
				break;
			}
			case 2: {
				add_book_to_author();
				break;
			}
			case 3: {
				removeBookFromAuthor();
				break;
			}
			case 4: {
				removeAuthorWithAllBooks();
				break;
			}
			case 5: {
				deleteAllBooksfromAuthor();
				break;
			}
			case 6: {
				sortByYear();
				break;
			}
			case 7: {
				sortByPage();
				break;
			}
			case 8: {
				showAllbooks();
				
				
				break;
			}
			case 9: {
				System.exit(325);
				
				
				break;
			}
				
			
			default:
				break;
			}
		}}
}
