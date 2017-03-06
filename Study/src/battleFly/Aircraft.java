package battleFly;

public abstract class Aircraft {
	
	void engineStart(){
		System.out.println("Engine starts at "+(int)((Math.random()*60)+20)+" seconds" );
	}
	void takeOff(){
		System.out.println("Aircraft will fly "+(int)(Math.random()*1000)+" km");
	}
	void landing(){
		System.out.println("Aircraft prepare for landing");
	}
	

}
