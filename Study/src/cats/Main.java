package cats;

public class Main {

	public static void main(String[] args) {

		Kitty myrchik = new Kitty(null, 0, 0);
		Jaguar killer = new Jaguar(null, 0, 0);
		
		myrchik.legRubbing();
		killer.setAge(6);
		killer.isHair();
		killer.toHunt();
		myrchik.peopleAttitude();

	}

}
