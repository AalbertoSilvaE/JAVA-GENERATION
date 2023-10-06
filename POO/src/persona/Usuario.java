package persona;

public class Usuario {
	
	//Atributos
	private String tipoUsuario;
	private String username;
	private String password;
	
	//Crear un nuevo usuario(Constructor)
	public Usuario(String tipoUsuario, String username, String password) {
		this.tipoUsuario = tipoUsuario;
		this.username = username;
		this.password = password;
	} // Constructor
		
		
	//Recuperar contrasenia (getter)
	public String getPassword() {
		//Si el usuario registrado coincide con el usuario que paso como parametro, entonces obtengo la contrasenia
		return password;
		
	}//getter
	
	
	//Cambiar contrasenia (setter)
		public void setPassword(String nuevoPassword) {
			//si la nueva contrasenia es diferente a una cadena vacia y es diferente a la contrasenia anterior...
			if (nuevoPassword != "" && nuevoPassword != password) {
				//... entonces reemplazo la contrasenia anterior
				System.out.println("Cambio de contrasenia exitoso");
			
			}else {
				System.out.println("Lo siento, no puedo cambiar la contrasenia");
			}
		}
	
	
	
	
	
	
	
	

}//clase usuario
