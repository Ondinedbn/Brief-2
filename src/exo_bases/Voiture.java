package exo_bases;

public class Voiture {
	private String marque;
	private double prix;
	private String carburant;
	
	
	//Constructeur simple à un argument
	public Voiture(String marque) {
		this.marque = marque;
	}
	
	public Voiture(String marque, double prix) {
		this.marque = marque;
		this.prix = prix;
	}
	
	public Voiture(String marque, double prix, String carburant) {
		this.marque = marque;
		this.prix = prix;
		this.carburant = carburant;
	}
	

}
