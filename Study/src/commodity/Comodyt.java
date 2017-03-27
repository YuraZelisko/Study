package commodity;

public class Comodyt {
	
	private String name;
	private int lenth;
	private int width;
	private int weight;
	public Comodyt(String name, int lenth, int width, int weight) {
		super();
		this.name = name;
		this.lenth = lenth;
		this.width = width;
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLenth() {
		return lenth;
	}
	public void setLenth(int lenth) {
		this.lenth = lenth;
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
	@Override
	public String toString() {
		return "Comodyt [name=" + name + ", lenth=" + lenth + ", width=" + width + ", weight=" + weight + "]";
	}
	

}
