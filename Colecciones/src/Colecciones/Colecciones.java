package Colecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Colecciones {
	
	public static void main(String[] args) {
		
		
		//Array
	
		//Tipo de dato del array, nombre, instancia del objeto arreglo, los datos
		
		/*
		String[] listaDeCompras = new String[] {"Leche", "Pan", "Huevos"};
		
		//Esta impresion solo muestra el espacio en memoria
		System.out.println(listaDeCompras);
		
		//Imprimir info de la listaDeCompras con un forEach
		//Para el dato de tipo String que llamaremos productoAImprimir de la lista de compras, lo vamos a tomar y lo vamos a imprimir.
		for(String productoAImprimir : listaDeCompras) {
			System.out.println(productoAImprimir);
		}//forEach
		
		*/
		
		//Implementacion de un arrayList
		//Clase General (interfaz), tipo de dato qu eusare, nombre de mi estrucutra de datos, instancia de dicha clase general.
		
		List<String> listaDeContactos = new ArrayList<>();
		
		
	listaDeContactos.add("Felipe");
	listaDeContactos.add("Marco");
	listaDeContactos.add("Brandon");
	listaDeContactos.add("Alan");
	listaDeContactos.add("Della");
	
	//Obtener un elemento de la lista - asignarlo a una variable
	
	String datoFelipe = listaDeContactos.get(0);
	
	System.out.println(datoFelipe);
	
	//Cambiar nombre de uno de los elementos d emi lista
	
	String datoMarco = listaDeContactos.set(1, datoFelipe);
	
	System.out.println(listaDeContactos);
	
	
	//Borrar un elemento de la lista
	
	listaDeContactos.remove(1);
	
	System.out.println(listaDeContactos);
	
		//implementacion de un conjunto (SET)
	    //Sintaxis
	    // Interface de donde implemento + tipo de dato que usare+ nombre que le doy al conjunto + instancia de la clase especifica
	
	
	
	   Set<String> cartasDeJuego = new HashSet<>();
	   
	   //Agregar elementos
	   cartasDeJuego.add("As de Corazones");
	   cartasDeJuego.add("2 de picas");
	   cartasDeJuego.add( "Reina de Treboles");
	   
	   if(cartasDeJuego.contains("Reina de Treboles")) {
		    System.out.println("La reina de teboles si esta en el conjunto");
	   } else { 
		   System.out.println("No encuentro el elemento solicitado");
	   }
	   
	   
	   //Implementacion de un mapa (hashMap)
	    
	   Map <String, String> libretaDirecciones = new HashMap<>(); 		
	   
	   //Agregar elementos a mi libreta de direcciones, donde mi K = nombre y mi V= direccion
	   libretaDirecciones.put("Felipe", "Tlanelpantla");
	   libretaDirecciones.put("Doctor Simi", "Chihuahua");
	   
	   //Metodo para sacar informacion de la ;ibreta, creando una nueva variable
	   
	   String direccionDeFelipe =  libretaDirecciones.get(libretaDirecciones);
	   String direccionDeNaruto = libretaDirecciones.get("Naruto");
	   
	   
	   // impresion
	  System.out.println(direccionDeFelipe);
	  System.out.println(direccionDeNaruto);
	
		
		
		
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


/*
 * 
 * 
 * - ArrayList
 * 
 * 
 * Es una implementacion de una lista (List), es decir, que esta en un nivel abajo de las listas. Utiliza un array dinamico que permite almacenar datos.
 * 
 * Sus principales caracteristicas son:
 * 
 * 	- Tamanio dinamico, a diferencia de los arrays tradicionales, el tamanio de un arrayList si se puede modificar.
 *  - Acceso rapido, podemos acceder a un elemento del arrayList por su posicion o indice
 *  - Coste elevado al momento de insertar o eliminar elementos. Si agrego un elemento, tengo que recorrer todos los demas elementos.
 * 
 * 
 * 
 *   Set (conjunto)
 *   
 *   Estrucutra de datos que almacena datos unicos sin orden especifico. Las principales caracteristicas de un set son:
 *   
 *      - No hay elementos duplicados, ya que los conjuntos no los pueden contener. Si se intenta agregar un elemento ya existente, la operacion se ignora
 *      
 *      - No hay un orden especifico, los elementos se almacenan sin orden especifico.
 *      - La busqueda es mas sencilla, ya que al no tener elementos duplicados se usa una funcion hash para encontrar elemento deseado.
 *      \
 *     
 *     
 *     
 *     Map(mapas)
 *     
 *     Un mapa es una estructura de datos que almacena pares de clave-valor
 *     
 *     - Almacenamiento con pares K-V (key-value)
 *     - Sin orden especifico (similar a un Set)
 *     - Busqueda rapida, la busqueda se hace por medio d eun valor (key), usa una funcion intern hash para buscar elementos.
 *     
 *     
 *  Agenda telefonica (agregar, modificar, eliminar)
 * 
 * 
 * 
 * 
 * */




