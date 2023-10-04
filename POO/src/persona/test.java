package persona;

public class test {
	
    //Metodo general para instanciar mis clases
	public static void main(String[] args) {
		
		//Instancia persona
		Persona Felipe = new Persona("Felipe", "Maqueda", (byte)31, "5512345678", "felipe@mail.com");	
		
		System.out.println(Felipe);// imprime lugar memoria
		Felipe.imprimirInfo();// imprime informacion
		Felipe.saludar();// imprime saludo
		
		//instancia de dentista
		Dentista Simi = new Dentista("Dr.Simi", "Lares", (byte)50, "123456789", "similares@mail.com", "Odontologia", "5551112244", "consultorio 500", "avanzado", "matutino", 500);
		System.out.println("**********");
		Simi.calcularSalario();
		Simi.imprimirInfoDentista();
		
		
		//Instancia de Dentista
		Paciente Chencho = new Paciente("CHNCH1234", "RH Positivo", true, true, "05/oct/2023", "Doc. Simi Lares", false);
		
		System.out.println("*********************");
		System.out.println(Chencho);
		
		//Instancia de Paciente con datos obligatorios
				Paciente Masiosare = new Paciente("MAS12345", false, false);
				System.out.println("********************");
				System.out.println(Masiosare);
		

	}// cierre metodo main

}// cierre class persona
