package ar.edu.unlam.basica2;

public class Tragamonedas {

	Tambor tambor1;
	Tambor tambor2;
	Tambor tambor3;
	FixNumberGenerator number = new FixNumberGenerator(1);

	public Tragamonedas() {
		tambor1 = new Tambor(number);
		tambor2 = new Tambor(number);
		tambor3 = new Tambor(number);

	}

	public void activar() {
		tambor1.girar();
		tambor2.girar();
		tambor3.girar();
	}

	public Boolean entregaPremio() {
		Integer posicionDelTambor1 = tambor1.getPosicion();
		Integer posicionDelTambor2 = tambor2.getPosicion();
		Integer posicionDelTambor3 = tambor3.getPosicion();
		Boolean valor=false;

		if (posicionDelTambor1 == posicionDelTambor2 && posicionDelTambor2 == posicionDelTambor3) {
			return valor=true;
		}
		
		else {
			return valor;
		}
		
	}

}
