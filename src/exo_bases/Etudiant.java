package exo_bases;

public class Etudiant {
	private static String prenom = "John";
	private static String nom = "Doe";
	private static int note_math = 10;
	private static int note_histoire = 12;
	private static int note_geo = 14;
	private static int note_francais = 16;

	public static int moyenneNotes() {
		int[] notes = { note_math, note_histoire, note_geo, note_francais };
		int sum = note_math + note_histoire + note_geo + note_francais;
		return sum / notes.length;

	}

	public static String initiales() {
		char premiereLettrePrenom = prenom.charAt(0);
		char premiereLettreNom = nom.charAt(0);
		String str = new StringBuilder().append(premiereLettrePrenom).append(premiereLettreNom).toString();
		return str;
	}

	public static String trigramme() {
		char premiereLettrePrenom = prenom.charAt(0);
		char premiereLettreNom = nom.charAt(0);
		int n = nom.length();
		char derniereLettreNom = nom.charAt(n - 1);
		String str = new StringBuilder().append(premiereLettrePrenom).append(premiereLettreNom)
				.append(derniereLettreNom).toString();
		return str;
	}
}
