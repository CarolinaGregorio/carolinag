package ar.edu.unlam.basica2;

import java.util.Comparator;

public class OrdenarPorEdad implements Comparator<Cliente> {

	@Override
	public int compare(Cliente miCliente1, Cliente miCliente2) {
		// TODO Auto-generated method stub
		return miCliente1.getEdad() - miCliente2.getEdad();
	}

}
