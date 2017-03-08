package enumer;

public class Main {

	public static void main(String[] args) {
		
		Trasport transport = Trasport.HORSE;
		
		System.out.println(transport.name().toLowerCase());
		
		System.out.println(Trasport.BIKE.name().toLowerCase());
		
		System.out.println(Trasport.HORSE.ordinal());
		
		Trasport [] trasports = Trasport.values();
		
		System.out.println(trasports[5]);
		
		Trasport [] trasports1 = Trasport.values();
		
					
		int maxSpeeds = 0;
		int maxI = 0;
		
		for (int i = 0; i < trasports1.length; i++) {
			if (maxSpeeds<trasports1[i].getMaxSpeed()){
				maxSpeeds = trasports1[i].getMaxSpeed();
				maxI = i;
			}
		}System.out.println(maxSpeeds);
		
	}

}
