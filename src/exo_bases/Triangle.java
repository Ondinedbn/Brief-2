package exo_bases;

public class Triangle {
	private double longueur_cote1;
	private double longueur_cote2;
	private double hauteur;
	private double base;
	private int point_a;
	private int point_b;
	private int point_c;

	public Triangle(double longueur_cote1, double longueur_cote2, double hauteur, double base, int point_a, int point_b,
			int point_c) {
		this.longueur_cote1 = longueur_cote1;
		this.longueur_cote2 = longueur_cote2;
		this.hauteur = hauteur;
		this.base = base;
		this.point_a = point_a;
		this.point_b = point_b;
		this.point_c = point_c;
	}

	public double perimetre() {
		return longueur_cote1 + longueur_cote2 + base;
	}

	public double aire() {
		return base * hauteur;
	}

	// Méthode déplacer le triangle
	public void moveTriangle(int newpoint_a, int newpoint_b, int newpoint_c) {
		this.point_a = newpoint_a;
		this.point_b = newpoint_b;
		this.point_c = newpoint_c;
	}

	// Méthode réduire le triangle
	public void reduceTriangle(double newlongueur1, double newlongueur2, double newbase) {
		this.longueur_cote1 = newlongueur1;
		this.longueur_cote2 = newlongueur2;
		this.base = newbase;
	}

	// Getters and Setters

	public double getLongueur_cote1() {
		return longueur_cote1;
	}

	public void setLongueur_cote1(double longueur_cote1) {
		this.longueur_cote1 = longueur_cote1;
	}

	public double getLongueur_cote2() {
		return longueur_cote2;
	}

	public void setLongueur_cote2(double longueur_cote2) {
		this.longueur_cote2 = longueur_cote2;
	}

	public double getHauteur() {
		return hauteur;
	}

	public void setHauteur(double hauteur) {
		this.hauteur = hauteur;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public int getPoint_a() {
		return point_a;
	}

	public void setPoint_a(int point_a) {
		this.point_a = point_a;
	}

	public int getPoint_b() {
		return point_b;
	}

	public void setPoint_b(int point_b) {
		this.point_b = point_b;
	}

	public int getPoint_c() {
		return point_c;
	}

	public void setPoint_c(int point_c) {
		this.point_c = point_c;
	}

}
