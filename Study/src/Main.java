import java.util.Scanner;

public class Main {

static	Scanner scanner = new Scanner(System.in);
static int capasity = scanner.nextInt();
	public static void main(String[] args) {
		System.out.println("Enter capasity");
		MyQueue myQueue = new MyQueue();
		myQueue.menu();
	}
}
