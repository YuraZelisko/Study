package battleFly;

public class SU27 extends FlyControl implements SpecialForces{
	
	int maxSpeed;
	String color;

	public SU27(int width, int weight, int lenght) {
		super(width, weight, lenght);
		// TODO Auto-generated constructor stub
	}
	
	

	public SU27(int width, int weight, int lenght, int maxSpeed, String color) {
		super(width, weight, lenght);
		this.maxSpeed = maxSpeed;
		this.color = color;
	}



	@Override
	public void turbo() {
		// TODO Auto-generated method stub
		System.out.println("turbo speed = " + (int)((Math.random()*200)+maxSpeed)+" km/h");
	}

	@Override
	public void stels() {
		// TODO Auto-generated method stub
		System.out.println("Aircraft is invisible during "+(int)(Math.random()*150)+" seconds");
	}

	@Override
	public void nuclearStrike() {
		// TODO Auto-generated method stub
		System.out.println((int)(Math.random()*10)+ " nuclear bobms was drop out");
	}

}
