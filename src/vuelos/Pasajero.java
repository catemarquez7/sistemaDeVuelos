package vuelos;

import java.time.LocalDate;

public class Pasajero extends Persona{

	//atributos
	protected Vuelo vuelo;
	protected int nroCliente;
	protected String asiento;
	
	//constructores
	public Pasajero(String nombre, String apellido, String dni, String edad, LocalDate fechaDeNacimiento, Vuelo vuelo,
			int nroCliente) {
		super(nombre, apellido, dni, edad, fechaDeNacimiento);
		this.vuelo = vuelo;
		this.nroCliente = nroCliente;
	}

	//getters y setters
	public Vuelo getVuelo() {
		return vuelo;
	}

	public void setVuelo(Vuelo vuelo) {
		this.vuelo = vuelo;
	}

	public int getNroCliente() {
		return nroCliente;
	}

	public void setNroCliente(int nroCliente) {
		this.nroCliente = nroCliente;
	}

	public String getAsiento() {
		return asiento;
	}

	public void setAsiento(String asiento) {
		this.asiento = asiento;
	}

	@Override
	public String toString() {
		return "Pasajero [vuelo=" + vuelo + ", nroCliente=" + nroCliente + ", asiento=" + asiento + ", nombre=" + nombre
				+ ", apellido=" + apellido + ", dni=" + dni + ", edad=" + edad + ", fechaDeNacimiento="
				+ fechaDeNacimiento + "]";
	}
	
	
	
}
