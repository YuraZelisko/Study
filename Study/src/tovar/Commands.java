package tovar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Formatter;
import java.util.List;

public class Commands {
	List <Commodity> commodities = new ArrayList<>();
		
	public void addCommodity(){
		String name = "item"+(int)(Math.random()*100);  //.toString().replaceAll("[^a-zA-Z]", "").toUpperCase();
		int weight = 10+(int) (Math.random() * 100);
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
	
	public void showPage() {
		  for (int i = 0; i < 3; i++) {
			  System.out.println( Main.formatter.format("%1$s %2$s %3$s", commodities.get(i), 
					  commodities.get(i+3), commodities.get(i+6)));
		  }

		 }
	
	public void show_pages(List<Commodity> commodities, int page) {
		  int spacing = 31;
		  for (int i = 0; i < 3; i++) {
		   Main.formatter = new Formatter();
		   System.out.println( Main.formatter.format("%1$s %2$s %3$s", commodities.get(i), commodities.get(i + 3),
				   commodities.get(i + 6)));
		  }
		  System.out.printf("%" + spacing + "s", "");
		  for (int i = 1; i <= 11; i++) {
		   if (i == page) {
		   } else {
		    System.out.print(" " + i + " ");
		   }
		   if (i == page) {
		    System.out.print("{" + page + "}");
		   }

		  }
		  System.out.println();
		 }
	
		public void show_all_commodities(){
			for (int i = 0; i < 33; i++) {
				 Main.formatter = new Formatter();
				System.out.println( Main.formatter.format("%1$s %2$s %3$s",i + " " +commodities.get(i), 
						i + " " +commodities.get(i + 33),i + " " +commodities.get(i + 66)));
				
			}
		}


}
