package employee;

public class MonthWork implements Salary {
	int daysInMonth;
	int moneyPerday;
	int AllMoney;

	@Override
	public void payment() {
		
		AllMoney=daysInMonth*moneyPerday;
		System.out.println("all month money = "+AllMoney);
		
	
		
	}

}
