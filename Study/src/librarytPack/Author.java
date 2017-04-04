package librarytPack;

public class Author extends Human  {
	

	private String name;
	private String lastName;
	

	public Author(int height, int weight, int age, String name, String lastName) {
		super(height, weight, age);
		this.name = name;
		this.lastName = lastName;
	}

	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	@Override
	public String toString() {
		return "Author [name=" + name + ", lastName=" + lastName + "]";
	}
	

}
