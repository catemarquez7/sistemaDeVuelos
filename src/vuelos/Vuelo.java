package vuelos;

import java.time.LocalDateTime;
import java.util.LinkedList;

import javax.swing.JOptionPane;

public class Vuelo {
	
	//clase
	static LinkedList<Vuelo> vuelos = new LinkedList<Vuelo>();

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

	public static LinkedList<Vuelo> getVuelos() {
		return vuelos;
	}
	
	public static void setVuelos(LinkedList<Vuelo> vuelos) {
		Vuelo.vuelos = vuelos;
	}
	
	@Override
	public String toString() {
		return "Vuelo: origen=" + origen + " destino=" + destino + " partida=" + partida
				+ " llegada=" + llegada + "\n \n";
	}

	public static void cargarVuelos() {
		Avion a1 = new Avion("Airbus A320", "1234", 5);
		Avion a2 = new Avion("Boeing 767", "6758", 6);
		Avion a3 = new Avion("Embraer 190", "9087", 4);
		Vuelo v1 = new Vuelo(a1, "Buenos Aires", "Londres", null, null);
		Vuelo v2 = new Vuelo(a2, "Buenos Aires", "Roma", null, null);
		Vuelo v3 = new Vuelo(a3, "Londres", "Buenos Aires", null, null);
		Vuelo v4 = new Vuelo(a2, "Roma", "Buenos Aires", null, null);
		Vuelo v5 = new Vuelo(a1, "Londres", "Roma", null, null);
		Vuelo v6 = new Vuelo(a3, "Roma", "Londres", null, null);
		v1.setPartida(LocalDateTime.of(2025, 6, 15, 20, 35));
		v1.setLlegada(LocalDateTime.of(2025, 6, 16, 9, 50));
		v2.setPartida(LocalDateTime.of(2025, 9, 4, 8, 20));
		v2.setLlegada(LocalDateTime.of(2025, 9, 4, 19, 30));
		v3.setPartida(LocalDateTime.of(2025, 11, 10, 22, 40));
		v3.setLlegada(LocalDateTime.of(2025, 11, 11, 11, 11));	
		v4.setPartida(LocalDateTime.of(2025, 3, 1, 20, 40));
		v4.setLlegada(LocalDateTime.of(2025, 3, 2, 21, 11));
		v5.setPartida(LocalDateTime.of(2025, 5, 10, 9, 20));
		v5.setLlegada(LocalDateTime.of(2025, 5, 11, 19, 10));
		v6.setPartida(LocalDateTime.of(2025, 7, 14, 12, 05));
		v6.setLlegada(LocalDateTime.of(2025, 7, 14, 23, 00));
		vuelos.add(v1);
		vuelos.add(v2);
		vuelos.add(v3);
		vuelos.add(v4);
		vuelos.add(v5);
		vuelos.add(v6);
	}
	
	public static void mostrarVuelos() {
		JOptionPane.showMessageDialog(null, vuelos);
	}

	

}
