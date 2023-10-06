package persona;

public class TestAsistenteDental {

	public static void main(String[] args) {
		
		
		//Instancia de nuestro asistente
		
				AsistenteDental Francisca = new AsistenteDental("05/10/2023", 875.40d);
				
				//Impresion de la informacion de nuestro asistente
				Francisca.mostrarDatosAsistentes();
				
				
				
				//El sueldo de Francisca no es de 875.4, es de 87.54
				//Cambio de sueldo
				//Francisca.salario=87.54d;
				
				
				
				//Mostrar solo el sueldo
				//System.out.println(Francisca.salario);
		
				System.out.println(Francisca.getSalario());
		
		//Modificar salario con el setter
				
		Francisca.setSalario(56.00);
		
		//Imprimir salario con setter
		System.out.println(Francisca.getSalario());
		

	}//Metodo main
	

}//clase testAsistenteDental



