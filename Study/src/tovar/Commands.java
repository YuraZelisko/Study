package tovar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public class Commands {

	List <Commodity> commodities = new ArrayList<>();
	
	public void addCommodity(){
		String name = UUID.randomUUID().toString().replaceAll("[^a-zA-Z]", "").toUpperCase();
		int weight = (int) (Math.random() * 100);
		int price = 100 + (int) (Math.random() * 900);
		Commodity commodity = new Commodity(name, weight, price);
		commodities.add(commodity);
		
	}
	
	public void sort_by_price_higher(){
		Collections.sort(commodities, new Sort_by_price_higher());
	}
	public void SortByLowerPrice(){
		Collections.sort(commodities, new SortByLowerPrice());
	}
	
//	public void add100(){
//		for (Commodity commodity : commodities) {
//			addCommodity(commodity);
//		}
//	}

}
