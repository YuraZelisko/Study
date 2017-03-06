package cats;

public class Animals {
	
	private String name;
	protected static boolean hair;
	private int age;
	
	
	
	public Animals(String name, boolean hair, int age) {
		super();
		this.name = name;
		this.hair = hair;
		this.age = age;
		
	
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isHair() {
		return hair;
	}
	public void setHair(boolean hair) {
		this.hair = hair;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void run(){
		System.out.println("animal run");
	}
	public  void live() {
		System.out.println("animal life");
	}
	

}
