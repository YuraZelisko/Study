package zooparty;

public class Animal {
	
	private String type;
	private String petname;
	public Animal(String type, String petname) {
		super();
		this.type = type;
		this.petname = petname;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPetname() {
		return petname;
	}
	public void setPetname(String petname) {
		this.petname = petname;
	}
	@Override
	public String toString() {
		return "Animal [type=" + type + ", petname=" + petname + "]";
	}
	
	

}
