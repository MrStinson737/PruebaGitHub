package poo;

import javax.swing.*;

public class Uso_Coche {

	public static void main(String[] args) {
		
		Coche micoche = new Coche(); //INSTANCIAR UNA CLASE
		
		micoche.config_asientos(JOptionPane.showInputDialog("¿Tiene asientos de cuero?"));
		
		micoche.config_climatizador(JOptionPane.showInputDialog("¿Tiene climatizador?"));
		
		micoche.establece_color(JOptionPane.showInputDialog("Introduce color"));
		
		System.out.println(micoche.dime_datos_generales());
		
		System.out.println(micoche.dime_color());
		
		System.out.println(micoche.dime_asientos());
		
		System.out.println(micoche.dime_climatizador());
		
		System.out.println(micoche.dime_peso_coche());
		
		System.out.println("El precio final del coche es de: " + micoche.precio_coche()+ " euros");
	}

}
