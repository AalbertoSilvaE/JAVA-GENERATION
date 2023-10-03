package loop;

import java.util.Scanner;

public class WhileLoop {
	public static void main(String[] args) {
		/*
		 * While. El ciclo 
		 * while ejecuta continuamente un bloque de codigo hasta que se cumpla
		 *   
		 *   While (expresion) {
		 *   //bloque de codigo a ejecutar
		 *   (contador - iterador)
		 *   }
		 */
		
		/*int cuenta = 1;
		while (cuenta < 11) {
			System.out.println("La cuenta es de: " + cuenta);
			cuenta++;	
		}*/
		
		int cuenta = 0;
		while (cuenta < 10) {
			cuenta ++;
			System.out.println("La cuenta es de: " + cuenta);
				
		}
		
		
		
		/*Crear un programa que solicite al usuario un numero, dicho numero sera tomado como el numero final de una cuenta, dicha cuenta comienza en 1, debe mostrar en consola la cuenta del 1 hasta el número proporcionado.
		 
		 1. Importar un scanner e implementarlo
		 2. un mensaje para darle contexto al usuario
		 3. Almacenar el número del usuario en una variable.
		 4. Guardar en variable el numero que inicia la cuenta (1)
		 5.Implementar un ciclo while.
		 6. Mostrar por consola el resultado
		*/
		
		//1. Crear e importar el Scanner.
		Scanner scanner = new Scanner(System.in);
		//2.
		System.out.println("Escribe un numero que servira como numero final de una cuenta");
		//3.
		int numFinal = scanner.nextInt();
		//4.
		int numInicial = 1;
		//5.
		while (numInicial <= numFinal){
			System.out.println("La cuenta va en " + numInicial);
			numInicial++;
		}
			
		
		scanner.close();
	}

}
