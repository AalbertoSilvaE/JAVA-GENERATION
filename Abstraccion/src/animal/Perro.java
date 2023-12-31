package animal;

public class Perro extends Animal { //Herencia de la clase superior Animal

	
		//"Polimorfear" o sobreescribir el metodo heredado
	
	@Override//con la anotacion @override, le decimos a JAVA que el metodo hacerSonido sera sobreescrito
		public void hacerSonido() {
			System.out.println("El perrito ladra y hace hace guau");
			
		}//Metodo hacerSonido heredado de animal
	
	public static void main(String[] args) {
		
		//Aqui NO hay polimorfismo, ya que instancio un animal generico, y utilizo su metodo hacerSonido
		Animal Generico = new Animal(); //Genera un animal generico (abstracto)
		Generico.hacerSonido();//antes de la ejecucion
		
		//Generar la instancia de mi perrito
		
		//SI hay polimorfismo, porque es el equivalente a decir "instancio un animal que es un perrito"
		//Referenciar primero la clase general, y luego la instancia particular, permite el polimorfismo
		
		Animal Chilaquil = new Perro();
		Chilaquil.hacerSonido(); //polimorfismo en tiempo de ejecucion
		
	}//Metodo main

	

}//cierre clase perro
