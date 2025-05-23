package vuelos;

import java.time.LocalDateTime;
import java.util.LinkedList;

public class Vuelo {

	//atributos
	protected Avion avion;
	protected String origen;
	protected String destino;
	protected LocalDateTime partida;
	protected LocalDateTime llegada;
	protected LinkedList<Pasajero> pasajeros;
	protected int asientosDisponibles;
	
	//constructor
	public Vuelo(Avion avion, String origen, String destino, LocalDateTime partida, LocalDateTime llegada) {
		super();
		this.avion = avion;
		this.origen = origen;
		this.destino = destino;
		this.partida = partida;
		this.llegada = llegada;
		this.pasajeros = new LinkedList<Pasajero>();
		this.asientosDisponibles = avion.getCapacidad();

	}

	//getters y setters
	public Avion getAvion() {
		return avion;
	}


	public void setAvion(Avion avion) {
		this.avion = avion;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public LocalDateTime getPartida() {
		return partida;
	}

	public void setPartida(LocalDateTime partida) {
		this.partida = partida;
	}

	public LocalDateTime getLlegada() {
		return llegada;
	}

	public void setLlegada(LocalDateTime llegada) {
		this.llegada = llegada;
	}

	public LinkedList<Pasajero> getPasajeros() {
		return pasajeros;
	}

	public void setPasajeros(LinkedList<Pasajero> pasajeros) {
		this.pasajeros = pasajeros;
	}

	public int getAsientosDisponibles() {
		return asientosDisponibles;
	}

	public void setAsientosDisponibles(int asientosDisponibles) {
		this.asientosDisponibles = asientosDisponibles;
	}

	@Override
	public String toString() {
		return "Vuelo: origen=" + origen + ", destino=" + destino + ",\n partida=" + partida
				+ ", llegada=" + llegada;
	}

	

}
