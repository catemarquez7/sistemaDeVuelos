package vuelos;

import javax.swing.JOptionPane;

public class Pasajero extends Persona{

	//atributos
	protected Vuelo vuelo;
	protected int nroCliente;
	
	//constructores
	public Pasajero() {
		super("", "", 0, 0);
	}
	
	public Pasajero(String nombre, String apellido, int dni, int edad,
			int nroCliente, Vuelo vuelo) {
		super(nombre, apellido, dni, edad);
		this.nroCliente = nroCliente;
		this.vuelo = vuelo;
	}

	//getters y setters
	public Vuelo getVuelo() {
		return vuelo;
	}

	public void setVuelo(Vuelo vuelo) {
		this.vuelo = vuelo;
	}

	public double getNroCliente() {
		return nroCliente;
	}

	public void setNroCliente(int d) {
		this.nroCliente = d;
	}
	
	@Override
	public String toString() {
		return "Pasajero [nroCliente=" + nroCliente + " nombre=" + nombre
				+ " apellido=" + apellido + "\n dni=" + dni + " edad=" + edad + "]";
	}
	
	//metodos
	public static Pasajero registrarPasajero(Vuelo vuelo) {
		String nombre = JOptionPane.showInputDialog("Ingrese su nombre:");
		nombre = Validaciones.validarText(nombre);
		String apellido = JOptionPane.showInputDialog("Ingrese su apellido:");
		apellido = Validaciones.validarText(apellido);
		JOptionPane.showMessageDialog(null, "Ingrese su edad:");
		int edad = Validaciones.validarNum();
		JOptionPane.showMessageDialog(null, "Ingrese su DNI:");
		int dni = Validaciones.validarNum();
		Pasajero p1 = new Pasajero(nombre, apellido, dni, edad, (int)(Math.random()*100+1), vuelo);
		return p1;
	}
	
	public static void reservarVuelo() {
		//menus y variables
		String[] menu1 = {"Buenos Aires", "Roma", "Londres"};
		String[] menu2 = {"SI", "NO"};
		String opcionOrigen, opcionDestino;
		int opcionSiNo;
		
		//inicio
		do {
		opcionOrigen = (String)JOptionPane.showInputDialog(null, "Seleccione su ciudad de origen:", "SELECCIONE", 0, null, menu1, menu1[0]);
		opcionDestino = (String)JOptionPane.showInputDialog(null, "Seleccione su ciudad de destino:", "SELECCIONE", 0, null, menu1, menu1[0]);
		} while (opcionOrigen == opcionDestino);
		for (int i = 0; i < Vuelo.vuelos.size(); i++) {
			if (Vuelo.vuelos.get(i).getOrigen().equals(opcionOrigen) && Vuelo.vuelos.get(i).getDestino().equals(opcionDestino)) {
				JOptionPane.showMessageDialog(null, "Excelente! Se ha encontrado un vuelo con origen en: " + opcionOrigen + " y destino en: " + opcionDestino + "\n\n " + Vuelo.vuelos.get(i).toString());
				opcionSiNo = JOptionPane.showOptionDialog(null, "Desea reservar un asiento para este vuelo?", "SELECCIONE", 0, 0, null, menu2, menu2[0]);
				if (opcionSiNo==0) {
					if (Vuelo.vuelos.get(i).getAsientosDisponibles() > 0) {
						JOptionPane.showMessageDialog(null, "Para poder finalizar la reserva, debera registrarse.");
						Vuelo.vuelos.get(i).pasajeros.add(registrarPasajero(Vuelo.vuelos.get(i)));
						Vuelo.vuelos.get(i).setAsientosDisponibles((Vuelo.vuelos.get(i).getAsientosDisponibles() - 1));
						JOptionPane.showMessageDialog(null, "Excelente! Su reserva quedo confirmada.");
					} else {
						JOptionPane.showMessageDialog(null, "Lo sentimos, no contamos con mas asientos disponibles \npara este vuelo.");
					}
				}
				
			}
		}
		
		
		
		
		
	}
	
	public static void mostrarReserva() {
		//variables
		int check;
		String input;
		boolean flag=false;
		
		//inicio
		do {
		input = JOptionPane.showInputDialog("Ingrese su DNI:");
		} while (input.isEmpty());
		check = Integer.parseInt(input);
	
			for (int i = 0; i < Vuelo.vuelos.size(); i++) {
				for (int j = 0; j < Vuelo.vuelos.get(i).pasajeros.size(); j++) {
					if (Vuelo.vuelos.get(i).getPasajeros().get(j).getDni() == check) {
						JOptionPane.showMessageDialog(null, "Tiene una reserva: \n" + Vuelo.vuelos.get(i).toString() + "A nombre de: " + Vuelo.vuelos.get(i).getPasajeros().get(j).toString());
						flag = true;
						break;
					}
				}
			}
			if (!flag) {
				JOptionPane.showMessageDialog(null, "Lo sentimos, no encontramos una reserva a su nombre.");
			}
	}

}
