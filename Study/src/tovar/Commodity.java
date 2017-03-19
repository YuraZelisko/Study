package tovar;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public class Commodity {
	private String name;
	private int weight;
	private int price;
	public Commodity(String name, int weight, int price) {
		super();
		this.name = name;
		this.weight = weight;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "\n [name=" + name + ", weight=" + weight + ", price=" + price + "]";
	}
	
	
	
	
	
}
