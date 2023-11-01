package Objetos;

public class Motor {
	
	private String tipo;
    private int potencia;
    private boolean estado;

    public Motor(String tipo, int potencia, boolean estado) {
        this.tipo = tipo;
        this.potencia = potencia;
        this.estado = estado;
    }

    public void arrancar() {
        estado = true;
        System.out.println("El motor está arrancado.");
    }

    public void apagar() {
        estado = false;
        System.out.println("El motor está apagado.");
    }

}
