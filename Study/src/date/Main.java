package date;

public class Main {

	public static void main(String[] args) {
		
		Main date = new Main();
		
		Man chyvak = new Man("Anton", 1500, new Job("rybak", 3500), new Gold(0));
		Woman oksana = new Woman("oksana", 100, new Job("sekretar", 1500), new Gold(0) );
		
		Gold brace = new Gold(1000);
		
		chyvak.getJob().setType("sportsman");
		chyvak.getGold().setGold(1000);
		chyvak.getJob().getPayment();
		
		chyvak.setGold(new Gold(1000));
		
		
		oksana.setGold(chyvak.getGold());
		oksana.getMoney();
		chyvak.setGold(null);

		System.out.println(chyvak.getJob().getType());
		System.out.println(chyvak.getGold());
		System.out.println(oksana.getMoney());
	}

}
