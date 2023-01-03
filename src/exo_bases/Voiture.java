package exo_bases;

public class Voiture {
	private String marque;
	private double prix;
	private String carburant;

	// Constructeur vide
	public Voiture() {

	}

	// Constructeur simple à un argument
	public Voiture(String marque) {
		this.marque = marque;
	}

	// Constructeur à deux arguments
	public Voiture(String marque, double prix) {
		this.marque = marque;
		this.prix = prix;
	}

	// Constructeur à trois arguments
	public Voiture(String marque, double prix, String carburant) {
		this.marque = marque;
		this.prix = prix;
		this.carburant = carburant;
	}

}
