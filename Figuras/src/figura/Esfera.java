package figura;
import java.lang.Math;

//Clase normal o concreta o tradicional, que implementa metodos de una interfasz llamada Calculable
public class Esfera implements Calculable{

	//Atributos
		double radio;
		final double pi = Math.PI;

		// Constructor
	    Esfera(double radio) {
	        this.radio = radio;
	    }
	    
		@Override
		public double calcularArea() {
			//Area= 4 π r*r
			return (4 * pi) * Math.pow(radio,2);
		}
		
		@Override
		public double calcularVolumen() {
			//V = 4/3 π r³
			return ( (4/3)*pi ) * Math.pow(radio,3);
		}

		@Override
		public double calcularPerimetro() {
			//Perimetro 2 * π * r 
			return 2 * pi * radio;
		}

}//Clase Esfera
