package Objetos;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hello word";
		System.err.println(str);

		// Instantiating person object
		Persona personaUno = new Persona(12345678, "Juan");
				
		System.out.println("Usuario: " + personaUno.getNombre() + "\n" + "DNI: " + personaUno.getDni());
	}

}
