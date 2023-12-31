package dataTypes;

public class DatosPrimitivos {
	public static void main(String[] args) {
		
		 /*
		 * Datos primitivos. Datos fundamentales en Java que sirven para gestionar los tipos de información más básicos
		 * Existen 8 tipos de datos primitivos: byte, short, int, long, float, dohble, boolean, char
		 */
		
		// byte age = 28; 
		 //System.out.println();//syso + ctrl space
		 
		//Vmin y Vmax
		//byte age = 127;
		
		// Byte.ValorMin y Byte.ValorMAX
				byte minByte = Byte.MIN_VALUE;	//tipoDeDatoByte.PropiedadEncontrarValorMínimo
				byte maxByte = Byte.MAX_VALUE;	//tipoDeDatoByte.PropiedadEncontrarValorMáximo
				System.out.println("El valor mínimo de byte es: " + minByte);
				System.out.println("El valor máximo de byte es: " + maxByte);
				
				// Short.ValorMin y Short.ValorMAX
				short minShort = Short.MIN_VALUE;
				short maxShort = Short.MAX_VALUE;
				System.out.println("El valor mínimo de short es: " + minShort);
				System.out.println("El valor máximo de short es: " + maxShort);
				
				// Integer.ValorMin y Integer.ValorMAX
				int minInt = Integer.MIN_VALUE;
				int maxInt = Integer.MAX_VALUE;
				System.out.println("El valor mínimo de int es: " + minInt);
				System.out.println("El valor máximo de int es: " + maxInt);
				
				// Long.ValorMin y Long.ValorMAX
				long minLong = Long.MIN_VALUE;
				long maxLong = Long.MAX_VALUE;
				System.out.println("El valor mínimo de long es: " + minLong);
				System.out.println("El valor máximo de long es: " + maxLong);
				
				// Float.ValorMin y Float.ValorMAX
		        float minFloat = Float.MIN_VALUE;
		        float maxFloat = Float.MAX_VALUE;
		        System.out.println("El valor mínimo de float es: " + minFloat);
		        System.out.println("El valor máximo de float es: " + maxFloat);

		        // Double.ValorMin y Double.ValorMAX
		        double minDouble = Double.MIN_VALUE;
		        double maxDouble = Double.MAX_VALUE;
		        System.out.println("El valor mínimo de double es: " + minDouble);
		        System.out.println("El valor máximo de double es: " + maxDouble);
		        
		        char valorChar1 = 64;
				char valorChar2 = 60;
				System.out.println(valorChar1);
				System.out.println(valorChar2);
				
				char aChiquita;
				aChiquita = 166;
				System.out.println(aChiquita);
				
				/*Casteo(conversion de tipos en Java).
				 * --Automatico (dato mas pequenio a un dato mas grande)
				 * --Manual (tipo de dato mas grande a fato mas pequenio)
				 * 
				 */
				
				int myNumber = 125;
				System.out.println(myNumber);
				//int < double
				double myCasting = myNumber;
				System.out.println(myCasting);
				
				short edad = 25;
				int valorEdad = edad;
				System.out.println(edad);
				System.out.println(valorEdad);
				
				// -- Manual
				
				int myNewCasting = (int) myCasting;
				System.out.println(myNewCasting);
				
				//Convertir de float a int
				float myFloat = 1.99f;
				System.out.println(myFloat);
				//Conversion
				int myNewFloat = (int) myFloat;
				System.out.println(myNewFloat);
				
				//Convertir de char a int
				char myChar = 'M';
				int myNewChar = myChar;
				System.out.println(myNewChar);
				
	
	}

}
