package poo;

public class Pruebas_Constantes {

	public static void main(String[] args) {
		
		Empleados trabajador1 = new Empleados("Paco");
		
		Empleados trabajador2 = new Empleados("Carlos");
		
		trabajador1.cambiaSeccion("RRHH");

		System.out.println(trabajador1.devuelveDatos());
		
		System.out.println(trabajador2.devuelveDatos());
	}

}


class Empleados{
	
	public Empleados (String nom){
		
	nombre = nom;
	
	seccion = "Administracion";
		
	
	}
	
	public void cambiaSeccion(String seccion){ //setter
		
		this.seccion = seccion;
		
		
	}
	

	
	public String devuelveDatos(){//Getter
		
		
		return "El nombre es: " + nombre + " y la sección es: " + seccion;
		
	}
	
	private final String  nombre;
	
	private String seccion;
	
	
	
}