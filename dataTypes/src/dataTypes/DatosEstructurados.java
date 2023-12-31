package dataTypes;

public class DatosEstructurados {
	public static void main (String[] args) {
		/*
		 * Datos estructurados. Son datos complejos que almacenan caracteres y/o cadenas de caracteres o bien, algún tipo de dato primitivo
		 * -- String. Cadena de Caracteres, se declaran entre comillas y hay que definir el tipo de dato con la palabra reservada String. Los Strings en JAVA se consideran un objeto.
		 * -- Arrays.
		 * -- Creados por el usuario (API Java)
*/
		String myString = "Hola, soy un string";
		System.out.println(myString);
		
		String helloString = new String("Hola, soy un segundo String");
		System.out.println(helloString);
		
		/*
		 * Metodo para Strings.
		 * -- String lenght. Metodo que permite medir la longitud d euna cadena de carcteres
		 * 
		 */
		
		String texto = "ASdFGhJKL";
		
		System.out.println("La longitud de la variable texto de tipo string es " + texto.length()); 
		
		/*
		 * Guardando la variable texto en una nueva variable de tipo int para pasarle el método length
		 * int metodoLength = texto.length();
		 *--Output: 10
		 *Imprimimos en consola la nueva variable
		 *System.out.println(metodoLength);
		 */
		
		//-- String: touperCase() y toLowerCase()
		String upperCase = texto.toUpperCase();
		System.out.println("Aplicando el metodo toUpperCase:" + upperCase);
		
		String lowerCase = texto.toLowerCase();
		System.out.println("Aplicando el metodo toLowerCase: " + lowerCase);
		
		// -- indexOf(). devuelve el indice de la primera aparicion de un texto especifico
		String fraseMotivacional = "Todo es temporal, echale ganitas";
		int  indexOf = fraseMotivacional.indexOf("temporal");
		System.out.println("La palabra 'temporal'inicia en el indice: " + indexOf);
		
		//-- Concatenacion
		String firstName = "Alberto ";
		String lastName = "Silva";
		
		String userName = firstName + "" + lastName;
		System.out.println(userName);
		
		System.out.println(firstName.concat(lastName));
		
		
		//-- Métodos de conversión (parseo)
		
		
				String presupuesto = "50000";
				System.out.println("El presupuesto es de $" + presupuesto + " y el tipo de dato es " + presupuesto.getClass().getSimpleName());
				
				int parseao = Integer.parseInt(presupuesto);
				System.out.println("Aplicando parseInt, el valor de " + presupuesto + " de tipo " + presupuesto.getClass().getSimpleName() + " ahora es " + parseao + " que ahora es de tipo " + ((Object)parseao).getClass().getSimpleName());
		
		/*
		 *  Arrays. Conocidos como arreglos, se trata de una coleccion de datos del mismo tipo
		 *  donde cada elemento corresponde a una posicion indentificada por indices numericos. cuando
		 *  trabajamos con arreglos de dos dimensiones (bidimensionalea), usamos el termino matriz.
		 *  */
				
				String[] cars = {"Volkswagen", "Ford", "Toyota", "Chevrolet"};
				System.out.println(cars);
				
				/*
				 * Variable por tipo de declaración
				 * -- Variables dinámicas. Son aquellas que se declaran con un valor pero que dicho valor puede cambiar durante el proceso.
				 * -- Variables constantes o finales. Su valor no puede modificarse.
				 * -- Variables literales (palabras reservadas). Su identificador es la representación de su valor y ya tiene un significado en el código fuente de Java 
				 * 
				 */
				float gastosMensuales = 35684.30f;
				System.out.println(gastosMensuales);
				
				gastosMensuales = 42699.2f;
				System.out.println("Ahora mis gastos mensuales ascienden a " + gastosMensuales);
				
				//Variables finales o constantes
				final int salario = 1500;
				System.out.println(salario);
 		
		
		 
		
	}

}
