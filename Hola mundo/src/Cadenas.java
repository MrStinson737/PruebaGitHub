
public class Cadenas {

	public static void main(String[] args) {
		String nombre = "RAUL";
		
		System.out.println("Mi nombre es " + nombre + " y tiene " + nombre.length() + " letras");
		
		System.out.println("La primera letra de mi nombre es " + nombre.charAt(0));
		
		int ultima = nombre.length() - 1;
		
		System.out.println("La última letra es la " + nombre.charAt(ultima));

	}

}
