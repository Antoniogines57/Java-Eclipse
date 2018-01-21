package joptionpane;
import javax.swing.JOptionPane;

public class Quarry {
	public static void main(String[]args) {
		JOptionPane.showMessageDialog(null, "Alerta por subnormal.");
		String cal =JOptionPane.showInputDialog("Cerdo de mierda, si o no?");
		if(cal.equals("si")==true) JOptionPane.showMessageDialog(null, "Aasqueroso de mierda");
		else JOptionPane.showMessageDialog(null, "Aun asi lo eres.");
		
	}
}
