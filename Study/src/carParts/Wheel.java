package carParts;

public class Wheel {
	
	int fullCircleTurn;
	int diameter;
	String turnSoft;
	public Wheel(int fullCircleTurn, int diameter, String turnSoft) {
		super();
		this.fullCircleTurn = fullCircleTurn;
		this.diameter = diameter;
		this.turnSoft = turnSoft;
	}
	public int getFullCircleTurn() {
		return fullCircleTurn;
	}
	public void setFullCircleTurn(int fullCircleTurn) {
		this.fullCircleTurn = fullCircleTurn;
	}
	public int getDiameter() {
		return diameter;
	}
	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}
	public String getTurnSoft() {
		return turnSoft;
	}
	public void setTurnSoft(String turnSoft) {
		this.turnSoft = turnSoft;
	}
	
	public  int diamChance(int change){
		diameter=diameter+change;
		return diameter;
	}
	
	public String soft(String string){
		if(!turnSoft.equals(turnSoft)){
			turnSoft=string;
			return turnSoft;
		}else{
			System.out.println("try another type about "+ string);
			
		}
		return turnSoft;
		
		
	}
	
	

}
