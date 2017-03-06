package carParts;

public class Car {
	
	Wheel wheel = new Wheel(3, 40, "softly");
	CarCase carCase = new CarCase(440, "angry", "diablo");
	Koleso kileso = new Koleso(16, "winter", "safetly");
	
	public Car(Wheel wheel, CarCase carCase, Koleso kileso) {
		super();
		this.wheel = wheel;
		this.carCase = carCase;
		this.kileso = kileso;
	}

	public Wheel getWheel() {
		return wheel;
	}

	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}

	public CarCase getCarCase() {
		return carCase;
	}

	public void setCarCase(CarCase carCase) {
		this.carCase = carCase;
	}

	public Koleso getKileso() {
		return kileso;
	}

	public void setKileso(Koleso kileso) {
		this.kileso = kileso;
	}
	
	

}
