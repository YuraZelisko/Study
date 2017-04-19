package cinema;
import java.util.Scanner;

public class Main {

	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		Cinema cinema = new Cinema(new Time(1, 10), new Time(23, 10));
		cinema.menu();
	}
}
