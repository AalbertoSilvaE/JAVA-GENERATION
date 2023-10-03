package controlDeFlujo;

import java.util.Scanner;

public class EjercicioPacienteMayorEdad {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrse la edad del paciente: ");
		int edad = scan.nextInt();
		boolean mayorEdad = (edad >= 18)?true:false;
		if (mayorEdad) {
			System.out.println("Su chamaco ya esta peludo");
		} else {
			System.out.println("Su morro todavia no puede votar");
		}
		
		
	}
	
	

}
