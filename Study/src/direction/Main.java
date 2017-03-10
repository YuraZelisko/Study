package direction;

public class Main {

	public static void main(String[] args) {
		WorldParts.NAMERICA.getWidth();
		WorldParts.AUSTRALIA.getLongit();
		System.out.println(WorldParts.EURASIA.getWidth());
		System.out.println(WorldParts.ANTARCTIKA.ordinal());
		System.out.println(WorldParts.NAMERICA.longit);
		System.out.println(WorldParts.SAMERIKA.way.equals(WorldParts.AUSTRALIA.way));
		System.out.println(WorldParts.AFRICA.compareTo(WorldParts.ANTARCTIKA));

	}

}
