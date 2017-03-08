package enumer;

public enum Trasport {

	BUS(60, 70), CAR(5, 140), BIKE(1, 60), TRAM(80, 45), TRIAN(600, 120), PLANE(260, 650), HORSE(2, 55);
	
	private int maxPassenger;
	private int maxSpeed;
	
	private Trasport(int maxPassenger, int maxSpeed) {
		this.maxPassenger = maxPassenger;
		this.maxSpeed = maxSpeed;
	}

	public int getMaxPassenger() {
		return maxPassenger;
	}

	public void setMaxPassenger(int maxPassenger) {
		this.maxPassenger = maxPassenger;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	
	
	
	
}
