package carParts;

public class Koleso {
	
	int size;
	String protectorType;
	String stopPads;
	public Koleso(int size, String protectorType, String stopPads) {
		super();
		this.size = size;
		this.protectorType = protectorType;
		this.stopPads = stopPads;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getProtectorType() {
		return protectorType;
	}
	public void setProtectorType(String protectorType) {
		this.protectorType = protectorType;
	}
	public String getStopPads() {
		return stopPads;
	}
	public void setStopPads(String stopPads) {
		this.stopPads = stopPads;
	}
	
	public int sizeChange(int dif){
		size=size+dif;
		return size;
	}
	
	public void turnSpeed(){
		System.out.println("max speed is "+(int)(Math.random()*140));
	}

}
