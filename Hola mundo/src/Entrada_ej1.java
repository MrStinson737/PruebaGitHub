
import java.util.*;

public class Entrada_ej1 {

	public static void main(String[] args) 
	
	{
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce tu nombre");
		
		String a = entrada.nextLine();
		
		System.out.println("Hola " + a + " encantado de conocerte");
		
		System.out.println("¿Cuantos años tienes?");
		
		int edad = entrada.nextInt();
		
		System.out.println("Oh! " + edad  + " es la mejor edad de todas");

		entrada.close();
		
		
	}

}
