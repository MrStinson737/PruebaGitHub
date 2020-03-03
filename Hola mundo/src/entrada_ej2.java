import javax.swing.*;

public class entrada_ej2 {

	public static void main(String[] args) 
	{
		
		String nombre_usuario = JOptionPane.showInputDialog("Introduce tu nombre, porfavor");
		
		String edad = JOptionPane.showInputDialog("Introduce la edad por favor");

		int edad_usuario = Integer.parseInt(edad);
		
		System.out.println("Hola " + nombre_usuario + ", el año que viene tendrás " + (edad_usuario + 1) + " años");
	}

}
