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
	
	//constructor
	public Vuelo(Avion avion, String origen, String destino, LocalDateTime partida, LocalDateTime llegada) {
		this.avion = avion;
		this.origen = origen;
		this.destino = destino;
		this.partida = partida;
		this.llegada = llegada;
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

	@Override
	public String toString() {
		return "Vuelo [avion=" + avion + ", origen=" + origen + ", destino=" + destino + ", partida=" + partida
				+ ", llegada=" + llegada + ", pasajeros=" + pasajeros + "]";
	}
	
	//metodos
	public static void cargarVuelos() {
		Avion a1 = new Avion("Airbus A320", "1234", 10);
		Avion a2 = new Avion("Boeing 767", "6758", 20);
		Avion a3 = new Avion("Embraer 190", "9087", 15);
		Vuelo v1 = new Vuelo(a1, "Buenos Aires", "Londres", null, null);
		Vuelo v2 = new Vuelo(a2, "Buenos Aires", "Roma", null, null);
		Vuelo v3 = new Vuelo(a3, "Buenos Aireso", "Miami", null, null);
		v1.setPartida(LocalDateTime.of(2025, 6, 15, 20, 35));
		v1.setLlegada(LocalDateTime.of(2025, 6, 16, 9, 50));
		v2.setPartida(LocalDateTime.of(2025, 9, 4, 8, 20));
		v2.setLlegada(LocalDateTime.of(2025, 9, 4, 19, 30));
		v3.setPartida(LocalDateTime.of(2025, 11, 10, 22, 40));
		v3.setLlegada(LocalDateTime.of(2025, 11, 11, 11, 11));
	}
	
	
	
	

}
