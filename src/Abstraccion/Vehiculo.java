package Abstraccion;

public abstract class Vehiculo {
  //Atributo
	public String marca;
	public int anio;
	
	//metodo concreto
	public void mostrarInfo () {
		System.out.println();
		System.out.println("Mi auto es: "  + marca + "y es del anio:" + anio);
	} //Mostrar info
	
	//Metodo abstracto
	public abstract void acelerar();
	
	//Metodo abstracto
		public abstract void frenar();
		
	
}



/*
 En JAVA , una clase abstracta es una clase que no puede ser implementada directamente (que no puede instanciar), si no que se utiliza como una vase para crear subcalses mas concretas. se utilizan para definir una estructura comun y compartir el comportamiento entree las subclases relacionadas.
 
 Una clase abstracta puede implementar metodos concretos (metodos que hemos utilizado hasta ahorita) y metodos abstractos.
 
 */