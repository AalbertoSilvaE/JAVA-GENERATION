package persona;

public class TestUsuario {
	
	
	
	
	
	public static void main(String[] args) {
		
		//Instancia de nuestro usuario
		Usuario Felipe = new Usuario ("Paciente", "FelipeChilaquil", "chilaquiles2710");
		
		Felipe.setPassword("arribaelchicharron"); //Cambio correcto
		
		Felipe.setPassword("");//no se puede cambiar
		
		Felipe.setPassword("chilaquiles2710");//no se puede cambiar
		
		
		
	}
		
	}

        //Cambiar la contrasenia de un objeto del tipo usuario
        //Felipe.setPassword (una donde la contraseña este vacia)
        //Felipe.setPassword (una donde la contraseña no este vacia pero sea igual a la anterior)
        //Felipe.setPassword (se cumplan las dos condiciones)




