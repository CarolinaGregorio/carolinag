package ar.edu.unlam.basica2;

import static org.junit.Assert.*;

import java.util.TreeSet;

import org.junit.Test;

public class TestBarDeHomero {

	@Test
	public void queNoSePermitanClientesConElMismoNombre() {
		BarDeHomero miBar = new BarDeHomero();
		miBar.ingresarClienteALaLista(new Cliente("Carolina", 19));
		miBar.ingresarClienteALaLista(new Cliente("Fabrizio", 19));
		miBar.ingresarClienteALaLista(new Cliente("Fulanito 3", 26));
		miBar.ingresarClienteALaLista(new Cliente("Fulanito 4", 21));
		miBar.ingresarClienteALaLista(new Cliente("Fulanito 5", 24));
		miBar.ingresarClienteALaLista(new Cliente("Fabrizio", 19));

		Integer esperado = 5;
		assertEquals(esperado, miBar.clientes.size(), 0.01);
	}

	@Test
	public void queLosClientesEstenOrdenadosAlfabeticamente() {
		BarDeHomero miBar = new BarDeHomero();
		miBar.ingresarClienteALaLista(new Cliente("Carolina", 19));
		miBar.ingresarClienteALaLista(new Cliente("Agustina", 19));
		miBar.ingresarClienteALaLista(new Cliente("Fabrizio", 26));
		miBar.ingresarClienteALaLista(new Cliente("Martina", 21));
		miBar.ingresarClienteALaLista(new Cliente("Valentin", 24));
		miBar.ingresarClienteALaLista(new Cliente("Milagros", 19));
		
		assertEquals("Agustina", miBar.getClientes().first().getNombre());
		assertEquals("Valentin", miBar.getClientes().last().getNombre());
		

		for (Cliente mostrarLista : miBar.clientes) {
			System.out.println(mostrarLista.getNombre() + " " + mostrarLista.getEdad());
		}
	}

	@Test
	public void queElBarAbraAunSunClientes() {
		BarDeHomero miBar = new BarDeHomero();
		miBar.abrirBar();

		assertEquals(0, miBar.clientes.size(), 0.01);
		Boolean esperado = true;
		assertTrue(miBar.abrirBar() == esperado);
	}

	@Test
	public void compararClientesQueEstenONoDentroDelBar(){
		Cliente miCliente =new Cliente("Carolina",19);
		Cliente miCliente2 = new Cliente("Carolina", 19);
		miCliente.compareTo(miCliente2);
	}
	
	@Test
	public void presentarCientesPorEdad(){
		OrdenarPorEdad compararPorEdad = new OrdenarPorEdad();
		BarDeHomero miBar = new BarDeHomero();
		
		miBar.ingresarClienteALaLista(new Cliente("Carolina", 19));
		miBar.ingresarClienteALaLista(new Cliente("Agustina", 20));
		miBar.ingresarClienteALaLista(new Cliente("Fabrizio", 26));
		miBar.ingresarClienteALaLista(new Cliente("Martina", 21));
		miBar.ingresarClienteALaLista(new Cliente("Valentin", 24));
		miBar.ingresarClienteALaLista(new Cliente("Milagros", 23));
		
		TreeSet <Cliente> clientesOrdenandosPorEdad = new TreeSet <Cliente>(compararPorEdad);
		clientesOrdenandosPorEdad.addAll(miBar.getClientes());
		miBar.setClientes(clientesOrdenandosPorEdad);
		
		assertEquals("Carolina", miBar.getClientes().first().getNombre());
		assertEquals("Fabrizio", miBar.getClientes().last().getNombre());
		
		for (Cliente mostrarLista : miBar.clientes) {
			System.out.println(mostrarLista.getNombre() + " " + mostrarLista.getEdad());
		}
	    }
	
		
	
}
