package ar.edu.unlam.basica2;

public class Cliente implements Comparable<Cliente> {

	private String nombre;
	private Integer edad;

	public Cliente(String nombre, Integer edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	@Override
	public boolean equals(Object miCliente) {
		if (miCliente instanceof Cliente) {
			Cliente miCliente2 = (Cliente) miCliente;
			if (this.getNombre().equalsIgnoreCase(miCliente2.getNombre())) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return 1;
	}

	@Override
	public int compareTo(Cliente otroCliente) {
		// TODO Auto-generated method stub
		return this.nombre.compareTo(otroCliente.getNombre());
	}
}