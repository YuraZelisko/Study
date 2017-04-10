package core2047;

public class Auto {
	private String brend;
	private Engine engine;
	public Auto(String brend, Engine engine) {
		super();
		this.brend = brend;
		this.engine = engine;
	}
	public String getBrend() {
		return brend;
	}
	public void setBrend(String brend) {
		this.brend = brend;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	@Override
	public String toString() {
		return "brend=" + brend + ", engine=" + engine;
	}
	
}
