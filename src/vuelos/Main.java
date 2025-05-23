package vuelos;

import java.time.LocalDateTime;
import java.util.LinkedList;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		//menus
		String[] menu1 = {"Registrarse", "Reservar vuelo", "Modificar reserva", "Ver reserva", "Salir"};
		String[] menu2 = {"Londres", "Roma", "Miami", "Salir"};
		String[] menu3 = {"Cambiar destino", "Cancelar reserva"};
		String[] menu4 = {"SI", "NO"};
		
		//variables
		int opcionMenu1, opcionMenu2, nroCliente=0, opcionReserva, opcionSiNo;
		Pasajero p1 = new Pasajero();
		
		//carga de vuelos
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
		
		//inicio
		JOptionPane.showMessageDialog(null, "Bienvenido a Aerolineas Da Vinci!");
		do {
			opcionMenu1 = JOptionPane.showOptionDialog(null, "Seleccione la opcion que desea realizar.", "SELECCIONE", 0, 0, null, menu1, menu1[0]);
			switch (opcionMenu1) {
			case 0:
				JOptionPane.showMessageDialog(null, "Excelente! Vamos a registrarlo en nuestra plataforma.");
				String nombre = JOptionPane.showInputDialog("Ingrese su nombre:");
				nombre = Validaciones.validarText(nombre);
				String apellido = JOptionPane.showInputDialog("Ingrese su apellido:");
				apellido = Validaciones.validarText(apellido);
				JOptionPane.showMessageDialog(null, "Ingrese su edad:");
				int edad = Validaciones.validarNum();
				JOptionPane.showMessageDialog(null, "Ingrese su DNI:");
				int dni = Validaciones.validarNum();
				p1.setNombre(nombre);
				p1.setApellido(apellido);
				p1.setEdad(edad);
				p1.setDni(dni);
				p1.setNroCliente(2390);
				JOptionPane.showMessageDialog(null, "Se ha registrado con exito!");
				JOptionPane.showMessageDialog(null, p1.toString());
				break;
			case 1:
				if (p1.getNombre().equals("")) {
					JOptionPane.showMessageDialog(null, "Primero debe registrarse.");
				} else {
					do {	
					opcionReserva =JOptionPane.showOptionDialog(null, "Seleccione el destino de su interes.", "SELECCIONE", 0, 0, null, menu2, menu2[0]);
					switch (opcionReserva) {
					case 0:
						JOptionPane.showMessageDialog(null, v1.toString());
						opcionSiNo = JOptionPane.showOptionDialog(null, "Le interesa reservar un asiento?", "SELECCIONE", 0, 0, null, menu4, menu4[0]);
						if (opcionSiNo==0) {
							if (v1.getAsientosDisponibles() > 0) {
								JOptionPane.showMessageDialog(null, "Reservando...");
								p1.setVuelo(v1);								
								v1.pasajeros.add(p1);
								p1.setAsiento("3");
								JOptionPane.showMessageDialog(null, "Listo! Su asiento es el numero:" + p1.getAsiento());
								opcionReserva=3;
							} else {
								JOptionPane.showMessageDialog(null, "Lo sentimos, no hay asientos disponibles \npara ese vuelo. Por favor, seleccione otro.");
							}
						} 
						break;
					case 1:
						JOptionPane.showMessageDialog(null, v2.toString());
						opcionSiNo = JOptionPane.showOptionDialog(null, "Le interesa reservar un asiento?", "SELECCIONE", 0, 0, null, menu4, menu4[0]);
						if (opcionSiNo==0) {
							if (v2.getAsientosDisponibles() > 0) {
								JOptionPane.showMessageDialog(null, "Reservando...");
								p1.setVuelo(v2);								
								v1.pasajeros.add(p1);
								v2.pasajeros.add(p1);
								p1.setAsiento("7");
								JOptionPane.showMessageDialog(null, "Listo! Su asiento es el numero:" + p1.getAsiento());
								opcionReserva=3;
							} else {
								JOptionPane.showMessageDialog(null, "Lo sentimos, no hay asientos disponibles \npara ese vuelo. Por favor, seleccione otro.");
							}
						}
						break;
					case 2:
						JOptionPane.showMessageDialog(null, v3.toString());
						opcionSiNo = JOptionPane.showOptionDialog(null, "Le interesa reservar un asiento?", "SELECCIONE", 0, 0, null, menu4, menu4[0]);
						if (opcionSiNo==0) {
							if (v3.getAsientosDisponibles() > 0) {
								JOptionPane.showMessageDialog(null, "Reservando...");
								p1.setVuelo(v3);								
								v1.pasajeros.add(p1);

								v3.pasajeros.add(p1);
								p1.setAsiento("4");
								JOptionPane.showMessageDialog(null, "Listo! Su asiento es el numero:" + p1.getAsiento());
								opcionReserva=3;
							} else {
								JOptionPane.showMessageDialog(null, "Lo sentimos, no hay asientos disponibles \npara ese vuelo. Por favor, seleccione otro.");
							}
						}
						break;
					}
					} while (opcionReserva!=3);
				}
				break;
			case 2:
				if (p1.getNombre().equals("")) {
					JOptionPane.showMessageDialog(null, "Primero debe registrarse.");
				} else {
					JOptionPane.showMessageDialog(null, "Ingrese su DNI:");
					int check = Validaciones.validarNum();	
					if (check != p1.getDni()) { //chequear de la lista de pasajeros que coincida el dni
						JOptionPane.showMessageDialog(null, "");
					} else {
						//modifica la reserva -> menu3 
					}
				}
				break;
			case 3:
				if (p1.getNombre().equals("")) {
					JOptionPane.showMessageDialog(null, "Primero debe registrarse.");
				} else {
					JOptionPane.showMessageDialog(null, "Ingrese su DNI:");
					int check = Validaciones.validarNum();	
					if (check != p1.getDni()) { //chequear de la lista de pasajeros que coincida el dni
						JOptionPane.showMessageDialog(null, "");
					} else {
						//ve la reserva -> vuelo.toString
					}
				}
				break;
			case 4:
				JOptionPane.showMessageDialog(null, "Muchas gracias por utilizar nuestro servicio! Nos vemos.");
				break;
			}
		} while (opcionMenu1!=4);

		
	}

}
