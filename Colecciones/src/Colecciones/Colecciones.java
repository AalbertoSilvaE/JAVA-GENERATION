package Colecciones;

public class Colecciones {
	
	public static void main(String[] args) {
		
		
		//Array
		//Tipo de dato del array, nombre, instancia del objeto arreglo, los datos
		
		String[] listaDeCompras = new String[] {"Leche", "Pan", "Huevos"};
		
		//Esta impresion solo muestra el espacio en memoria
		System.out.println(listaDeCompras);
		
		//Imprimir info de la listaDeCompras con un forEach
		//Para el dato de tipo String que llamaremos productoAImprimir de la lista de compras, lo vamos a tomar y lo vamos a imprimir.
		for(String productoAImprimir : listaDeCompras) {
			System.out.println(productoAImprimir);
		}//forEach
		
	}//Metodo main

}//Clase colecciones


/*
 *  Colecciones
 *  
 *  
 *   - Arrays (arreglos)
 *   
 *    Es una estructura de datos linal que contiene elemetnos del mismo tipo. Los elementos del mismo tipo. Los elementos estan almacenados de forma contigua (uno al lado del otro), y se pueden acceder a ellos a traves de un indice. Las principales caracteristicas de un array son:
 *    
 *    - Es una estructura de datos fija, generalmente almacena datos del mismo tipo.
 *    - La longitud de un array se establece por medio de un indice.
 *    - Los arrays pueden contener datos primitivos y objetos.
 *    - No proporciona metodos adicionales para agregar o eliminar elementos
 *    
 *    
 * Un ejemplo de array es una lista de compras del supermercado
 * 
 * 
 */
