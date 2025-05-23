package vuelos;

import javax.swing.JOptionPane;

public class Validaciones {

	public static String validarText(String text) {
		while (text.isEmpty()) {
			text = (String)JOptionPane.showInputDialog("Ingrese nuevamente:");
		}
		return text;
	}
	
	public static int validarNum() { 
		String input;
		int num;
		boolean flag = true;
		do {	
			do {
				input = (String)JOptionPane.showInputDialog(null, "Ingrese:");
			} while (input.isEmpty());
			flag = true;
			for (int i = 0; i < input.length(); i++) {
				if (!Character.isDigit(input.charAt(i))) {
					flag = false;
					break;
				} }
			if (flag) {
	            num = Integer.parseInt(input);
	            if (num <= 0) {
	                flag = false;
	                JOptionPane.showMessageDialog(null, "Debe ser mayor que 0");
	            } }
		} while (!flag);
		return Integer.parseInt(input);
	}
	
	
	
}
