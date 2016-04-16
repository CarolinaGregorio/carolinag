package ar.edu.unlam.tp1;

import static org.junit.Assert.*;
import org.junit.Test;

public class CirculoTest {
	
	@Test
	public void crearUnCirculoConRadio2() {
		Circulo circuloConRadio2 = new Circulo();
		assertEquals(2, circuloConRadio2.getRadio(), 0.01);
	
	}
	
	@Test
	public void crearUnCirculoConRadio3Punto7() {
		Circulo circuloConRadio3Punto7 = new Circulo(3.7);
		assertEquals(3.7, circuloConRadio3Punto7.getRadio(), 0.01);
	}
	
	@Test
	public void crearUnCirculoConRadio5() {
		Circulo circuloConRadio5 = new Circulo(5);
		assertEquals(5, circuloConRadio5.getRadio(), 0.01);
	}
	
	@Test
	public void crearUnCirculoConRadio10Punto9() {
		Circulo circuloConRadio10Punto9 = new Circulo(10.9);
		assertEquals(10.9, circuloConRadio10Punto9.getRadio(), 0.01);
	}
	
	@Test
	public void queElAreaDeUnCirculoConRadio9Punto8Es301Punto56() {
		Circulo circuloConRadio9Punto8 = new Circulo (9.8);
		assertEquals(9.8, circuloConRadio9Punto8.getRadio(), 0.01);
		assertNotEquals(615.73, circuloConRadio9Punto8.calcularArea(),0.01);
		assertEquals(301.56, circuloConRadio9Punto8.calcularArea(), 0.01);
	}
	
	@Test
	public void crearUnCirculoConRadio16Punto6Es865Punto25() {
		Circulo circuloConRadio16Punto6 = new Circulo (16.6);
		assertEquals(16.6, circuloConRadio16Punto6.getRadio(), 0.01);
		assertNotEquals(865.67, circuloConRadio16Punto6.calcularArea(),0.01);
		assertEquals(865.25, circuloConRadio16Punto6.calcularArea(), 0.01);
		}
	
	@Test
	public void queElPerimetroDeUnCirculoConRadio9Punto8es61Punto54(){
		Circulo circuloConRadio9Punto8 = new Circulo (9.8);
		assertEquals(9.8, circuloConRadio9Punto8.getRadio(), 0.01);
		assertEquals(61.54, circuloConRadio9Punto8.calcularPerimetro(), 0.01);
	}
	
	@Test
	public void queElPerimetroDeUnCirculoConRadio16Punto6es104Punto24(){
		Circulo circuloConRadio16Punto6 = new Circulo (16.6);
		assertEquals(16.6, circuloConRadio16Punto6.getRadio(), 0.01);
		assertEquals(104.24, circuloConRadio16Punto6.calcularPerimetro(), 0.01);
	}
	
	@Test
	public void queElTipDeAyudaDeVerde(){ // :)
		
		Double esperado = 1.10;
		Double actual = 1.10;
		
		/**
		 *  Recordar que el siguiente método se puede usar por que al inicio del archivo
		 *  se importaron todos los assert con la siguiente linea 
		 *  import static org.junit.Assert.*; 
		 */
		 
		assertEquals(esperado.doubleValue(), actual.doubleValue(),0.01);
	}
	
}
