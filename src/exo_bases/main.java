package exo_bases;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// Exercice 1
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word");
		String input = sc.nextLine();
		System.out.println(countLetters(input));
		// Exercice 2
		System.out.println(minToMaj(input));
		// Exercice 3
		System.out.println(replaceWithStars(input));
		sc.close();

		// Exercice 4
		Bibliotheque maBiblio = new Bibliotheque();
		maBiblio.addLivre("Alice au Pays des Merveilles", "Lewis", "Caroll", "Contes", "978-2-218-966613");
		System.out.println(maBiblio.toString());

		// Exercice 5
		Triangle monTriangle = new Triangle(5.0, 5.0, 7.0, 7.0, 3, 5, 8);
		monTriangle.moveTriangle(4, 6, 6);

		// Exercice 7
		System.out.println(Etudiant.moyenneNotes());
		System.out.println(Etudiant.initiales());
		System.out.println(Etudiant.trigramme());

	}

	public static String countLetters(String str) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			Integer count = map.get(str.charAt(i));
			if (count == null) {
				map.put(str.charAt(i), 1);
			} else {
				map.put(str.charAt(i), count + 1);
			}
		}
		return "The total number of each letter is" + " " + map;
	}

	// Exercice 2
	public static String minToMaj(String input) {
		return input.toLowerCase() + " " + input.toUpperCase();
	}

	// Exercice 3
	public static String replaceWithStars(String input) {
		char[] chars = input.toCharArray();
		for (int i = 0; i < chars.length; i = i + 2) {
			chars[i] = '*';
			input = Arrays.toString(chars).replace(',', ' ');
		}
		return input;
	}

}
