package tovar;

import java.util.Formatter;
import java.util.Scanner;

public class Main {
	static Formatter formatter = new Formatter();

	public static void main(String[] args) {

		Commands command = new Commands();
		Scanner scanner = new Scanner(System.in);
		boolean work = true;
		
		while (work) {
			System.out.println("Press 1 for add");
			System.out.println("Press 2 for sort price higher");
			System.out.println("Press 3 for sort price lower");
			System.out.println("Press 4 for show page");
			String input = scanner.next();
			switch (input) {
			case "1": {
				for (int i = 0; i < 100; i++) {
					command.addCommodity();
				}
				break;
			}
			case "2":
				command.sort_by_price_higher();
				break;
			case "3":
				command.SortByLowerPrice();
				break;
			case "4": {
				System.out.println("Enter page");
				int page = scanner.nextInt();
				int max = page * 9;
				int min = page * 9 - 9;
				if (max > (command.commodities.size()) && min > command.commodities.size()) {
					System.out.println("We do not have such a page");
				} else if (max > (command.commodities.size())) {
					System.out.println(command.commodities.subList(min, command.commodities.size()));
				} else {
					command.show_pages(command.commodities.subList(min, max), page);
				}
				break;
			}
			case "5": {
				command.show_all_commodities();
				break;
			}
			default:
				break;
			}
		}
	}
}
