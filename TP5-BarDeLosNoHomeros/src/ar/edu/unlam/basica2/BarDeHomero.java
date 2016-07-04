package ar.edu.unlam.basica2;

import java.util.TreeSet;

public class BarDeHomero {
	TreeSet<Cliente> clientes;
	Boolean abierto;

	public BarDeHomero() {
		this.clientes = new TreeSet<Cliente>();
		this.abierto = false;
	}

	public Boolean abrirBar() {
		if (this.clientes == null) {
			return abierto = true;
		} else {
			return abierto = true;
		}
	}

	public void ingresarClienteALaLista(Cliente cliente) {
		this.clientes.add(cliente);
	}

	public TreeSet<Cliente> getClientes() {
		return this.clientes;
	}
	
	public void setClientes(TreeSet<Cliente> clientes){
		this.clientes = clientes;
	}

}