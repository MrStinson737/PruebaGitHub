import javax.swing.*;
public class numerospractica {

	public static void main(String[] args) 
	{
	
		String num_dec = JOptionPane.showInputDialog("Introduce un numero ");
		
		double num = Double.parseDouble(num_dec);
		
		System.out.print("La raíz de " + num + "es ");
		
		System.out.printf("%1.8f",Math.sqrt(num));

	}

}
