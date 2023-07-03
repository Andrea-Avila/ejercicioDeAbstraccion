package Abstraccion;

public class Motocicleta extends Vehiculo {

	
	//las anotaciones @ son "identificaciones" que le damos a JAVA
	@Override
	public void acelerar() {
		System.out.println("La motocicleta esta acelerando");
		
		//las subclase es quien decide cuando y como se sobreescribe eel metodo abstracto.Es decir, la subclase implementa el metodo.
	}

	@Override
	public void frenar() {
		System.out.println("La motocicleta esta frenando");
		
	}

}
