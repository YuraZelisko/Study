package verhovnaRada;

import java.util.ArrayList;
import java.awt.List;
import java.util.Scanner;

public class Rada{
	
	ArrayList<Fraction> fractions1 = new ArrayList<>();
	private Fraction faction;
	String name;
	ArrayList<Fraction> fractions = new ArrayList<>();
	Fraction fraction = new Fraction(name);

	public void addFraction() {
		System.out.println("Enter name of fraction");
		String name = Main.scanner.next();
		Fraction fraction = new Fraction(name);
		// fraction.addDepatat();
		fractions1.add(fraction);

		// System.out.println(fraction.toString());
	}

	public void allFractions() {
		for (int i = 0; i < fractions1.size(); i++) {
			System.out.println(fractions1.get(i));

		}
	}

	public void deleteFraction() {
		System.out.println("Enter name of fraction which you want to delete");
		String name = Main.scanner.next();
		for (int i = 0; i < fractions1.size(); i++) {
			if (name.equalsIgnoreCase(fractions1.get(i).getFactionName())) {
				fractions1.remove(i);
			}
		}
	}

	public void showFraction() {
		System.out.println("Enter name of fraction which you want to show");
		String name = Main.scanner.next();
		for (int i = 0; i < fractions1.size(); i++) {
			if (name.equalsIgnoreCase(fractions1.get(i).getFactionName())) {
				System.out.println(fractions1.get(i));
			}
		}
	}

	public void addAnDeputyToConcreteFraction() {
		System.out.println("Enter name of fraction");
		String name = Main.scanner.next();
		for (int i = 0; i < fractions1.size(); i++) {
			if (name.equalsIgnoreCase(fractions1.get(i).getFactionName())) {
				fractions1.get(i).addDeputy();
				;
			}
		}
	}

	public void showAllBribersInFraction() {
		System.out.println("Enter name of fraction");
		String name = Main.scanner.next();
		for (int i = 0; i < fractions1.size(); i++) {
			if (name.equalsIgnoreCase(fractions1.get(i).getFactionName())) {
				fractions1.get(i).factionGrafter();
			}
		}
	}

	public void deleteDeputy() {
		System.out.println("Enter name of fraction which you want to delete");
		String name = Main.scanner.next();
		for (int i = 0; i < fractions1.size(); i++) {
			if (name.equalsIgnoreCase(fractions1.get(i).getFactionName())) {

				fractions1.get(i).remuveDeputy();

			}
		}
	}
}
