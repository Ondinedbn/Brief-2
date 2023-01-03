package exo_bases;

public class Livre {
	private String titre;
	private String prenom_auteur;
	private String nom_auteur;
	private String categorie;
	private String isbn;

	public Livre(String titre, String prenom_auteur, String nom_auteur, String categorie, String isbn) {
		this.titre = titre;
		this.prenom_auteur = prenom_auteur;
		this.nom_auteur = nom_auteur;
		this.categorie = categorie;
		this.isbn = isbn;
	}

	public String codeLivre() {
		char firstLetterName = prenom_auteur.charAt(0);
		char firstLetterSurname = nom_auteur.charAt(0);
		char firstLetterCategory = categorie.charAt(0);
		int n = isbn.length();
		char lastLetterIsbn = isbn.charAt(n - 2);
		char secondToLastLetterIsbn = isbn.charAt(n - 1);
		String code = new StringBuilder().append(firstLetterName).append(firstLetterSurname).append(firstLetterCategory)
				.append(lastLetterIsbn).append(secondToLastLetterIsbn).toString();
		return code;
	}

	public String infoLivre() {
		return this.titre + " " + "écrit par " + this.prenom_auteur + " " + this.nom_auteur + " " + "catégorie : "
				+ this.categorie + " " + "ISBN : " + this.isbn;
	}

}
