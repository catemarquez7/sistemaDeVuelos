package vuelos;

public class Avion {

	//atributos
	protected String modelo;
	protected String matricula;
	protected int capacidad;
	
	//constructor
	public Avion(String modelo, String matricula, int capacidad) {
		super();
		this.modelo = modelo;
		this.matricula = matricula;
		this.capacidad = capacidad;
	}

	//getters y setters
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	@Override
	public String toString() {
		return "Avion [modelo=" + modelo + ", matricula=" + matricula + ", capacidad=" + capacidad + "]";
	}

	
	
}
