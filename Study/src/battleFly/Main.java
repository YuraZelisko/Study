package battleFly;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		SU27 destroer = new SU27(22, 920, 30, 850, "pinky");
		
		destroer.engineStart();
		destroer.takeOff();
		destroer.moveUp();
		destroer.moveRight();
		destroer.moveLeft();
		destroer.moveDown();
		destroer.stels();
		destroer.nuclearStrike();
		destroer.turbo();
		destroer.landing();
		
		

	}

}
