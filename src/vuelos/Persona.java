package vuelos;

import java.time.LocalDate;

public class Persona {

	//atributos
	protected String nombre;
	protected String apellido;
	protected String dni;
	protected String edad;
	protected LocalDate fechaDeNacimiento;
	
	//constructor
	public Persona(String nombre, String apellido, String dni, String edad, LocalDate fechaDeNacimiento) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.edad = edad;
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	//getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", edad=" + edad
				+ ", fechaDeNacimiento=" + fechaDeNacimiento + "]";
	}
	
	
	
	
}
