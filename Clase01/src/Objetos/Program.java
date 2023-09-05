package Objetos;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hello word";
		System.err.println(str);

		// Instantiating person object
		Persona personaUno = new Persona();
		personaUno.dni = 12345678;
		personaUno.nombre = "Juan";
		
		System.out.println("Usuario: " + personaUno.dni + "\n" + "DNI: " + personaUno.nombre);
	}

}
