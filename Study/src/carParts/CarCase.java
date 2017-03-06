package carParts;

public class CarCase {
	
	int weight;
	String shape;
	String color;
	
	public CarCase(int weight, String shape, String color) {
		super();
		this.weight = weight;
		this.shape = shape;
		this.color = color;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	public void crush(){
		System.out.println("carcase is crushed");
	}

}
