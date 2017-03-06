package battleFly;

public class FlyControl extends Aircraft{
	
	private int width;
	private int weight;
	private int lenght;
	
	public FlyControl(int width, int weight, int lenght) {
		super();
		this.width = width;
		this.weight = weight;
		this.lenght = lenght;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getLenght() {
		return lenght;
	}

	public void setLenght(int lenght) {
		this.lenght = lenght;
	}
	
	public void moveUp(){
		System.out.println("Su-27 get Upper");
	}
	
	public void moveDown(){
		System.out.println("Su-27 get Down");
	}
	public void moveRight(){
		System.out.println("Su-27 get Right");
	}
	
	public void moveLeft(){
		System.out.println("Su-27 get Left");
	}
	
	

}
