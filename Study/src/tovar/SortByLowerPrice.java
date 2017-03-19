package tovar;

import java.util.Comparator;

public class SortByLowerPrice implements Comparator<Commodity>{
	
		@Override
		public int compare(Commodity o1, Commodity o2) {
			// TODO Auto-generated method stub
			return o1.getPrice() - o2.getPrice();
		}
		
}
