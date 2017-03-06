package carParts;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car(new Wheel(3, 30, "crazy"), new CarCase(450, "robo", "green"), 
				new Koleso(16, "summer", "protected"));
		
		car.getWheel();
		car.getKileso();
		

	}

}
