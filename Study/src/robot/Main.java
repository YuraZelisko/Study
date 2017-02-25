package robot;

import java.util.ArrayList;
import java.util.Collection;

public class Main {

	public static void main(String[] args) {
		Robot robik = new Robot();
		CoffeRobot cofik = new CoffeRobot();
		RobotDancer dancik = new RobotDancer();
		RobotCooker cook = new RobotCooker();
				
		robik.work();
		cofik.work();
		dancik.work();
		cook.work();
		
		Robot robots [] = {robik, cofik, dancik, cook};
		for (int i = 0; i < robots.length; i++) {
			robots [i].work();
		}
		
		
}
}
