package cats;

public abstract class Cat extends Animals{
	
	private String voice;
	private int paws;
	private int weight;
	
	
	
	public Cat(String voice, int paws, int weight) {
		super(voice, hair, weight);
		this.voice = voice;
		this.paws = paws;
		this.weight = weight;
	}
	
	

	public String getVoice() {
		return voice;
	}



	public void setVoice(String voice) {
		this.voice = voice;
	}



	public int getPaws() {
		return paws;
	}



	public void setPaws(int paws) {
		this.paws = paws;
	}



	public int getWeight() {
		return weight;
	}



	public void setWeight(int weight) {
		this.weight = weight;
	}



	public void hideToilet(){
		System.out.println("excrements hidden");
	}
	
	public void nightVision(){
		System.out.println("I see you");
	}
	
	public abstract void toScream();
	public abstract void peopleAttitude();
	

}
