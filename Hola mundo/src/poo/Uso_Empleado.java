package poo;

import java.util.*;

public class Uso_Empleado {

	public static void main(String[] args) {
		
		/*Empleado empleado1 = new Empleado("Raul Prieto", 24000, 2017, 10, 13 );
		
		Empleado empleado2 = new Empleado("Carmen Sevillano", 36000, 2013,7 , 9);
		
		Empleado empleado3 = new Empleado("Carlos Vega", 40000, 2012, 3, 20);
		
		empleado1.subeSueldo(5);
		
		empleado2.subeSueldo(5);
		
		empleado3.subeSueldo(5);
		
		System.out.println("Nombre: " + empleado1.dameNombre() + " Sueldo: " + empleado1.dameSueldo() + "�" 
					+ " Fecha de Alta: " + empleado1.dameFechaContrato());
		
		System.out.println("Nombre: " + empleado2.dameNombre() + " Sueldo: " + empleado2.dameSueldo() + "�" 
				+ " Fecha de Alta: " + empleado2.dameFechaContrato());
		
		System.out.println("Nombre: " + empleado3.dameNombre() + " Sueldo: " + empleado3.dameSueldo() + "�" 
				+ " Fecha de Alta: " + empleado3.dameFechaContrato());*/
		
		Empleado[] misEmpleados = new Empleado[3];
		
		
		
		misEmpleados[0] = new Empleado("Paco Gomez", 85000, 1990, 12, 17);
		
		misEmpleados[1] = new Empleado("Ines Perez", 32000, 1998, 4, 12);
		
		misEmpleados[2] = new Empleado("Daniel Gonzalez", 72000, 1994, 10, 15);
		
		for (int i = 0; i < 3; i++){
			
			misEmpleados[i].subeSueldo(5);
		}
		
		for (int i = 0; i < 3; i++){
			
			System.out.println("Nombre: " + misEmpleados[i].dameNombre() + " Sueldo: " + misEmpleados[i].dameSueldo() + "�" 
					+ " Fecha de Alta: " + misEmpleados[i].dameFechaContrato());
		}
	}

}

class Empleado{
	
	public Empleado(String nom, double sue, int agno, int mes, int dia){
		
		nombre = nom;
		
		sueldo = sue;
		
		GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1, dia);
		
		altaContrato = calendario.getTime();
		
	}
	
	public String dameNombre(){//Getter
		
		return nombre;
		
	}
	
	public double dameSueldo(){//getter
		
		return sueldo;
		
	}
	
	public Date dameFechaContrato(){//getter
		
		return altaContrato;
	}
	
	public void subeSueldo(double porcentaje){//setter
		
		double aumento = sueldo*porcentaje/100;
		
		sueldo += aumento;
		
	}
	
	private String nombre;
	
	private double sueldo;
	
	private Date altaContrato;
	
	
}