package vuelos;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		//menus y variables
		String[] menu1 = {"Ver vuelos", "Reservar vuelo", "Ver reserva", "Salir"};
		int opcionMenu1;
				
		//inicio
		Vuelo.cargarVuelos();	
		JOptionPane.showMessageDialog(null, "Bienvenido a Aerolineas Da Vinci!");
		do {
			opcionMenu1 = JOptionPane.showOptionDialog(null, "Seleccione la opcion que desea realizar.", "SELECCIONE", 0, 0, null, menu1, menu1[0]);
			switch (opcionMenu1) {
			case 0:
				Vuelo.mostrarVuelos();
				break;
			case 1:
				Pasajero.reservarVuelo();
				break;
			case 2:
				Pasajero.mostrarReserva();
				break;
			case 3:
				JOptionPane.showMessageDialog(null, "Muchas gracias por utilizar nuestro servicio! Nos vemos.");
				break;
			}
		} while (opcionMenu1!=3);
		
	}
	//despues agregarle mas funcionalidades, como modificar el origen/destino de la reserva o cancelarla
}
