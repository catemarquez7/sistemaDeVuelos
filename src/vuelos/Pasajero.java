package vuelos;

public class Pasajero extends Persona{

	//atributos
	protected Vuelo vuelo;
	protected int nroCliente;
	protected String asiento;
	
	//constructores
	public Pasajero() {
		super(null, null, 0, 0);
	}
	
	public Pasajero(String nombre, String apellido, int dni, int edad,
			int nroCliente) {
		super(nombre, apellido, dni, edad);
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
				+ ", apellido=" + apellido + ", dni=" + dni + ", edad=" + edad + "]";
	}
	
	//metodos
	public void reservarVuelo() {
		
	}
	
	
}
