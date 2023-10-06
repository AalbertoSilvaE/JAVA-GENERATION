package persona;

public class AsistenteDental {
	
	//1 Atributos privados
	String fechaIngreso;
	double salario;
	
	
	//2 constructor
	public AsistenteDental(String fechaIngreso, double salario) {
		this.fechaIngreso = fechaIngreso;
		this.salario = salario;
	}//constructor
	
	
	//3 metodos
	public void mostrarDatosAsistentes() {
		System.out.println("La fecha de ingreso del asistente es: " + fechaIngreso);
        System.out.println("El salario del asistente es: " + salario);
	}//Metodo imprimir informacion
	
	
	//Getters y setters para poder acceder a mis datos privados y poder realizar operaciones en elllos
	// Sin getters, la informacion me aparece en null
	//Sin setters, no puedo cambiar la informacion
	
	
	//Este getter permite retornar el dato de la fecha de ingreso en formato String
	public String getfechaIngreso() {
		return fechaIngreso;
	}//getFechaIngreso
	
	
	//getter para salario
	public double getSalario () {
		return salario;
	}//getSalario
	
	//setter para salario (modificar los datos)
		public void setSalario(double nuevoSalario) {
			if (nuevoSalario >0 && nuevoSalario <100) {
				salario = nuevoSalario;
			}//cierre if
		}//cierre setter
	
	
	
	
	
	
	

}// cierre AsistenteDental
