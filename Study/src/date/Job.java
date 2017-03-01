package date;

public class Job {
	
	private String type;
	private int payment;
	
	public Job(String type, int payment) {
		super();
		this.type = type;
		this.payment = payment;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPayment() {
		return payment;
	}

	public void setPayment(int payment) {
		this.payment = payment;
	}
	
	

}
