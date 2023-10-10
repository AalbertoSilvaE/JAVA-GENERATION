//Vamos a usar clases abstractas para evitar la instanciacion de objetos que no necesito (generalmente son objetos muy abstractos, como persona, figura, transporte, animal, comida, arte, operaciones matematicas, lecturas, ropa, plants, paises, etc



package figura;

//Utilizando clases abstractas, evitamos las instancias no necesaias
//Para que una clase se vuelva abstracta, usamos la palabra reservada abstract antes de class 
public abstract class Figura {
	//Declaramos un metodo abstracto (no tiene cuerpo)
	//Metodo abstracto que nos dice QUE TENEMOS QUE HACER pero NO NOS DICE EL COMO
    public abstract double calcularArea();
	
}//Clase figura



/*
 * NOTA: Las clases abstractas pierden la capacidad de instanciar.
 * Una clase abstracta, necesita si o si metodos abstractos.
 * Cuando usamos clases abstractas, estamos "obligados" a utilizar todos los metodos abstractos
 * 
 */
