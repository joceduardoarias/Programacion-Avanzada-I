package Objetos;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hello word";
		System.err.println(str);

		// Instantiating person object
		Persona personaUno = new Persona(12345678, "Juan");
		Persona personaDos = new Persona(12345678, "Juan");
		
		System.out.println(personaUno.toString());
		System.out.println("\n");
		System.out.println(personaDos.toString());
		System.out.println("\n");
		
		if(personaUno.equals(personaDos)) {
			System.out.println("Las dos instancias son del tipo Persona y tienen el mismo DNI");
		}else {
			System.out.println("Las dos instancias son del tipo Persona y tiene distinto DNI");
		}
	}

}
