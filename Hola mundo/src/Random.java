import java.util.*;
public class Random {

	public static void main(String[] args) 
	{
		int aleatorio = (int)(Math.random()*100);

		Scanner entrada = new Scanner(System.in);
		
		int numero = 0;
		
		int intentos = 0;

		while(numero != aleatorio)
		{
			intentos++;
			System.out.println("Introduce un numero, porfavor");
			
			numero = entrada.nextInt();
			
			if(aleatorio < numero)
			
			{
				System.out.println("Menor");
			}
			
			else if (aleatorio > numero)
			{
				System.out.println("Mayor");
			}
			
		
			
		}
		
		System.out.println("Correcto");
		System.out.println("Has usado "+ intentos + " intentos");
	}
	
}
