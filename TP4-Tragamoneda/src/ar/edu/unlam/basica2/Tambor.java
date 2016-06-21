package ar.edu.unlam.basica2;

public class Tambor {
	private Integer posicion;
	RandomNumberGenerator number = new RandomNumberGenerator();
	

	public Tambor(NumberGenerator generator) {
		posicion=generator.generate();
	}

	public Integer getPosicion() {
		return posicion;
	}

	public void girar() {
		posicion = number.generate();
	}
}
