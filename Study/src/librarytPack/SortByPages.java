package librarytPack;

import java.util.Comparator;
import java.util.List;

public class SortByPages implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		// TODO Auto-generated method stub
		return o1.getPagesQuantity()-o2.getPagesQuantity();
	}

}
