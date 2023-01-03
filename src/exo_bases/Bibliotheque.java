package exo_bases;

import java.util.ArrayList;
import java.util.List;

public class Bibliotheque {
	List<Livre> maBibliotheque = new ArrayList<>();

	public void addLivre(String titre, String prenom_auteur, String nom_auteur, String categorie, String isbn) {
		Livre unlivre = new Livre(titre, prenom_auteur, nom_auteur, categorie, isbn);
		maBibliotheque.add(unlivre);
	}

	// méthode pour afficher les infos d'un livre
	public String toString() {
		String r = "";
		for (Livre unlivre : maBibliotheque) {
			r += unlivre.infoLivre() + "\n" + unlivre.codeLivre() + "\n";
		}
		return r;
	}

}
