package Objetos;

public class Ventana {
	
	private String tipo;
    private String material;
    private boolean abierta;

    public Ventana(String tipo, String material, boolean abierta) {
        this.tipo = tipo;
        this.material = material;
        this.abierta = abierta;
    }

    public void abrir() {
        abierta = true;
        System.out.println("La ventana está abierta.");
    }

    public void cerrar() {
        abierta = false;
        System.out.println("La ventana está cerrada.");
    }
}
