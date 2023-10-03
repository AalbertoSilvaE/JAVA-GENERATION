package persona;

public class Persona {
	//1 Atributos (info de como se mostrara mi objeto cuando se instancie)
	String nombre;
	String apellido;
	byte edad; // Para tener una correcta asignacion de memoria
	String telefono;
	String email;
	
	//2 Constructor con parametros
	Persona(String nombre, String apellido, byte edad, String telefono, String email){
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.telefono = telefono;
		this.email =  email;
		
	} //cierre de mi constructor
	
	
	
	//3 Metodos ( lo que podra hacer mi objeto)
	void imprimirInfo() {
		System.out.println("El nombre es: " + nombre);
		System.out.println("El apellido es: + apellido ");
		System.out.println("La edad es: " + edad);
		System.out.println("El telefono es: " + telefono);
		System.out.println("El email es: " + email);	
	}//cierre imprimirInfo
	
	void saludar() {
		System.out.println("Hola, te mando saludos");
	}

	
	
	
	//4 Instancia
	
	
	
	
	
	

}//Cierre de POO
