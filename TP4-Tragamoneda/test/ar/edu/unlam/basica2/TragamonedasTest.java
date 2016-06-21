package ar.edu.unlam.basica2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TragamonedasTest {

	@Test
	public void queLosTamboresEstenEnPosicionesEntre1Y10() {
		RandomNumberGenerator posicion = new RandomNumberGenerator();
		Integer esperado = posicion.generate();
		
		assertTrue(esperado > 0 && esperado < 11);
	}

	@Test
	public void queLosTresTamboresEstenEnPosicion1(){
		Tragamonedas miTragamonedas = new Tragamonedas();
		miTragamonedas.activar();
		
		Integer posicionDelTambor1 = miTragamonedas.tambor1.getPosicion();
		Integer posicionDelTambor2 = miTragamonedas.tambor2.getPosicion();
		Integer posicionDelTambor3 = miTragamonedas.tambor3.getPosicion();
		
		assertTrue(posicionDelTambor1 == 1 && posicionDelTambor2 == 1 && posicionDelTambor3 == 1);
	}
	
	@Test
	public void queMiTragamonedasFuncioneCorrectamente(){
		Tragamonedas miTragamonedas = new Tragamonedas();
		miTragamonedas.activar();
	
		Integer posicionDelTambor1 = miTragamonedas.tambor1.getPosicion();
		Integer posicionDelTambor2 = miTragamonedas.tambor2.getPosicion();
		Integer posicionDelTambor3 = miTragamonedas.tambor3.getPosicion();
		
		System.out.println("Tambor 1: " + posicionDelTambor1);
		System.out.println("Tambor 2: " + posicionDelTambor2);	
		System.out.println("Tambor 3: " + posicionDelTambor3);
		
		if (miTragamonedas.entregaPremio()) {
			System.out.println("¡Ganaste! Retirá tu premio");
		
		}
		else{
			System.out.println("¡Perdiste! Volvé a intentarlo");
			
		}
			
		}
	
}
