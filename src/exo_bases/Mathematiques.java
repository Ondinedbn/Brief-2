package exo_bases;

public class Mathematiques {
	private double num1;
	private double num2;
	

	public double addition(double num1, double num2) {
		return num1 + num2;
	}
	

	public double soustraction(double num1, double num2) {
		return num1 - num2;
	}
	
	public double multiplication(double num1, double num2) {
		return num1 * num2;
	}
	
	public double division(double num1, double num2) {
		return num1 / num2;
	}
	
	
	
	//Getters and Setters

	public double getNum2() {
		return num2;
	}

	public void setNum2(double num2) {
		this.num2 = num2;
	}

	public double getNum1() {
		return num1;
	}

	public void setNum1(double num1) {
		this.num1 = num1;
	}
}
