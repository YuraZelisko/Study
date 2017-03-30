package librarytPack;

import java.util.Comparator;
import java.util.List;

public class SotrByYear implements Comparator<Book> {


	@Override
	public int compare(Book o1, Book o2) {
		
		return o1.getYearCreate()-o2.getYearCreate();
	}
	

}
