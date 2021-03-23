package ro.fasttrackit.homework;

/*1) scrieti o functie care primeste un sir de numere intregi si returneaza suma lor.
---
2) scrieti o functie care primeste un sir de numere intregi si returneaza numarul de elemente impare.
---
3) scrieti o functie care primeste un sir de numere intregi si un alt numar intreg.
Returnati toate numerele mai mari decat numarul primit.
---
4) scrieti o functie care primeste un numar intreg reprezentand targetul de donatii.
Donatiile se vor face cu ajutorul obiectului Random. Primim donatii pana cand ajungem la suma dorita.
Cand ajungem la suma dorita afisam un mesaj de succes.
---
5) rescrieti functia de la 4 cu urmatoarea modificare: functia va primi si un numar maxim de donatii.
Cand acesta se termina, campania se va incheia.
---
6) scrieti o functie care primeste un string cu o fraza (mai multe propozitii despartite prin punct).
Printati fiecare propozitie pe o linie noua*/

import java.util.Random;

public class homeworkCurs6 {
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int sum = exercise1(numbers);
		System.out.println(sum);

		int sumEven = exercise2(numbers);
		System.out.println(sumEven);

		int number = 3;
		exercise3(numbers, number);

		int target = 100_000;
		exercise4(target);

		String phrase = "Ana are mere. Merele sunt bune. Afara bate vantul.";
		exercise6(phrase);
	}

	public static int exercise1(int[] numbers) {
		System.out.print("Exercise 1: the sum of numbers is ");
		int sum = 0;
		for (int all : numbers) {
			sum += all;
		}
		return sum;
	}

	public static int exercise2(int[] numbers) {
		System.out.print("Exercise 2: the sum of even numbers is ");
		int sumEven = 0;
		for (int all : numbers) {
			if (all % 2 == 0) {
				sumEven += all;
			}
		}
		return sumEven;
	}

	public static void exercise3(int[] numbers, int number) {
		System.out.print("Exercise 3: the numbers greater than " + number + " are: ");
		for (int all : numbers) {
			if (all > number) {
				System.out.print(all + " ");
			}
		}
		System.out.println(" ");
	}

	public static void exercise4(int target) {
		System.out.println("Exercise 4: Target donations " + target);
		Random donation = new Random();

		while (target >= 0) {
			int nextDonation = donation.nextInt(target + 1);
			if (nextDonation == target) {
				System.out.println("Donation: " + nextDonation);
				System.out.println("Success!");
				break;
			} else {
				System.out.println("Donation: " + nextDonation);
				target -= nextDonation;
				System.out.println("   Remaining: " + target);
			}
		}
	}

	public static void exercise6(String phrase) {
		System.out.println("Exercise 6: Print sentence/line ");
		String[] splitPhrase = phrase.split("\\.");
		for (String all : splitPhrase) {
			System.out.println(all.trim());
		}
	}
}

