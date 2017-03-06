package employee;

public class HourWork implements Salary {
	
	int hours;
	int money;
	int AllMoney;

	@Override
	public void payment() {
		
		AllMoney=hours*money;
		System.out.println("all month money = "+AllMoney);
		
	}

}
