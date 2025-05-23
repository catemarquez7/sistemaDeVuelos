package vuelosTest;

import javax.swing.JOptionPane;

import vuelos.Pasajero;
import vuelos.Validaciones;
import vuelos.Vuelo;

public class Main {

	public static void main(String[] args) {

		//menus
		String[] menu1 = {"Registrarse", "Reservar vuelo", "Modificar reserva", "Ver reserva", "Salir"};
		String[] menu2 = {"Londres", "Roma", "Miami"};
		String[] menu3 = {"Cambiar destino", "Cambiar titular"};
		String[] menu4 = {"SI", "NO"};

		
		//variables
		int opcionMenu1, opcionMenu2, nroCliente=0, opcionReserva;
		Pasajero p1 = null;
		
		//inicio
		Vuelo.cargarVuelos();
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
				p1 = new Pasajero(nombre, apellido, dni, edad, (nroCliente+1));
				JOptionPane.showMessageDialog(null, "Se ha registrado con exito!");
				JOptionPane.showMessageDialog(null, p1.toString());
				break;
			case 1:
				if (p1==null) {
					JOptionPane.showMessageDialog(null, "Primero debe registrarse.");
				} else {
					opcionReserva = (int)JOptionPane.showInputDialog(null, "Seleccione el destino de su interes.", "SELECCIONE", 0, null, menu2, menu2[0]);
					//que muestre info del vuelo, si la persona quiere,
					//chequee si hay asientos disponibles y reserve (lo añade a la lista de pasajeros)
				}
				break;
			case 2:
				if (p1==null) {
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
				if (p1==null) {
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
