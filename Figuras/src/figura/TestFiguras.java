package figura;

public class TestFiguras {

	public static void main(String[] args) {
		
		//Generar la sinstancias de nuestras clases
		
		//1. Instancia de la clase Figura
		
		//Figura Generica = new Figura();
		
		//2. Instancia de un rectangulo
		Figura rectangulo = new Rectangulo(5.0, 6.5);//Base y altura
		 
		
		// 3. instancia de un circulo
		Figura circulo = new Circulo(3.14, 3.0);//Pi y radio
		
		//4 invocacion del metodo
		System.out.println(rectangulo.calcularArea()); 
		System.out.println(circulo.calcularArea());
	}// metodo main

}//class TestFiguras
