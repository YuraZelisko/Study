package date;

import java.util.Set;

public class Man {

	private String name;
	private int money;
	private Job job;
	private Gold gold;
	
	public Man(String name, int money, Job job, Gold gold) {
		super();
		this.name = name;
		this.money = money;
		this.job = job;
		this.gold = gold;
	}
	


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money+getJob().getPayment();
	}

	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	public Gold getGold() {
		return gold;
	}

	public  void setGold(Gold gold) {
		this.gold = gold;
		
	}
	

}
