package loop;

public class Loop {
	public static void main(String[] args) {
		/*
		 * El ciclo for proporciona una forma completa de iterar sobre valores.
		 * for (inicializacion; condicion; contador (incremento/ decremento){
		 *  //Bloque de codigo
		 *  }
		 */
		for (int numero = 1; numero <= 10; numero ++) {
			System.out.println("Numero igual a " + numero);
		}
	
	
	//for con variable global
	
	int contador;
	for (contador = 1; contador <= 5; contador++) {
		System.out.println("La cuenta es " + contador);
	}
	
	/*
	 * Bucles anidados. Bucle dentro de otro bucle.
	 */
	// Imprimir una forma triangular de asteriscos.
	
	int filas = 5;
	
	for (int i = 0; i < filas; i++) {
		//Bloque de codigo que va a iterar sobre el primer bucle
		for (int j = 0; j <= i; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	//Calcular 5 potencias del valor PI
	
	/* Output 
	 * PI elevado a la 1 potencia es igual a 3.1416..
	 * PI elevado a la 2 potencia es igual a ......
	 * ...
	 */
	System.out.println("El valor de PI es " + Math.PI);
	
	int potencias = 5;
	for(int base = 1; base <= potencias; base++) {
		double resultado = Math.pow(Math.PI, base);
		System.out.println("PI elevado a la " + base + " es igual a " + resultado);
		
	
		
	}
}}


