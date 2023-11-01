package Objetos;

public class Puerta {
	private String material;
    private String color;
    private boolean cerrada;

    // Una puerta tiene una ventana
    private Ventana ventana = new Ventana("Corrediza", "Vidrio", false);

    public Puerta(String material, String color, boolean cerrada) {
        this.material = material;
        this.color = color;
        this.cerrada = cerrada;
    }

    public void abrirPuerta() {
        cerrada = false;
        System.out.println("La puerta está abierta.");
    }

    public void cerrarPuerta() {
        cerrada = true;
        System.out.println("La puerta está cerrada.");
    }

    public void abrirVentana() {
        ventana.abrir();
    }

    public void cerrarVentana() {
        ventana.cerrar();
    }
}
