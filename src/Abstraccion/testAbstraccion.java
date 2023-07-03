package Abstraccion;

public class testAbstraccion {
	
	public static void main (String[]args) {
	
		
		//instancia de  la clase automovil
		Automovil mytroquita = new Automovil();
		//IANTSNCIA DE la clase  motocicleta
		Motocicleta ninja= new Motocicleta();
		
		//llamamos lo metodos en cada instancia
		
		mytroquita.acelerar();
		ninja.acelerar();
		
		mytroquita.frenar();
		ninja.frenar();
		
	}
}
