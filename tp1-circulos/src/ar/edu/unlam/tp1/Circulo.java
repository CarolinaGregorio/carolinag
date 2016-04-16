package ar.edu.unlam.tp1;

public class Circulo {

	private double radio;
	private static final double PI=3.14;
	
	
	public Circulo(){
		this.radio = 2;
	}
	
	public Circulo(double radio){
		this.radio = radio;
	}
	
	public void setRadio(double radio){
		if(radio>=0){
			this.radio=radio;
		}
	}
	
	public double getRadio(){
		return this.radio;
	}
	
	public double calcularPerimetro(){
		return 2*PI*this.radio;
	}
	
	public double calcularArea(){
		return PI*this.radio*this.radio;
	}

}
