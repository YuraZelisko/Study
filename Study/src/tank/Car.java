package tank;

import java.util.ArrayList;
import java.util.List;

public class Car {
	
	private int id;
	private String name;
	private int year;
	private int maxSpeed;
	private String model;
	public Car(int id, String name, int year, int maxSpeed, String model) {
		super();
		this.id = id;
		this.name = name;
		this.year = year;
		this.maxSpeed = maxSpeed;
		this.model = model;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	@Override
	public String toString() {
		return "id=" + id + " name=" + name + " year=" + year + " maxSpeed=" + maxSpeed + " model=" + model;
	}
	
	
	

}
