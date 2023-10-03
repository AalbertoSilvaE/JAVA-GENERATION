package controlDeFlujo;

public class EstrucutrasDeControl { //Debe coincidir la clase cin el nombre de enuestro documento
	
	public static void main(String[] args) { //Todo dentro del metodo main
		
		// Recordad que para que algo se ejecute, siempre debe de ir dentro del metodo principial
		
		
		//primero definir la variable del tipo String donde almaceno un dato
		String citaProgramada = null; //Dejamos en null y despues lo cambiamos  auna fecha 28/09/2023
		//La variable declarada se inicia en null a proposito para tener un espacio de memoria ya asignado y solo reemplazarlo con un nuevo dato.
		
		if (citaProgramada != null) {
			System.out.println("No hay cita disponible, ya hay una cita programada, seleccione otra fecha"); // Por que variable ya esta ocupada o llena	
		} else {
			System.out.println("Pued registrar su cita");//Podemos registrar la cita
		}
		
		/////////////////////////////////////////////////////////////////
		
		//Seleccionamos una opcion y almacenando la variable ocpion
		
		int opcion = 1;
		//Creamos un menu
		System.out.println("Menú del consultorio dental el diente feliz");
		System.out.println("1. Desea programar una cita?");
		System.out.println("2. Verifique su cita si este programada");
		System.out.println("3. cancelar cita");
		System.out.println("4. Salir del menú");
		System.out.print("Seleccione una opcion del menú (1-4) ");
		
		switch (opcion) {
		case 1:
			System.out.println("Usted ha seleccionado la opcion programar cita."); //agrega la logica para programar una cita
			break;
		case 2: 
			System.out.println("Usted ha seleccionado la opcion verificar cita");
		break;
		case 3: 
			System.out.println("Usted ha seleccionado la opcion de cancelar cita :( ");	
		break;
		case 4: 
			System.out.println("Usted ha seleccionado la opcion salir del menú");
			break;
			default:
				System.out.println("La opcion que usted selecciono no es valida. Por favor, seleccione una ocpion de nuestro menu (1-4) ");
				break;
		
		}
		
		
		
		
	}//Metodo

}// Clase
