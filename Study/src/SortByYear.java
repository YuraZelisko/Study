import java.util.Comparator;

public class SortByYear implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		// TODO Auto-generated method stub
		return o2.getAge()-o1.getAge();
	}
	
	
	

}
