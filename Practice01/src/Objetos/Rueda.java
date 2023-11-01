package Objetos;

public class Rueda {
	
	private String material;
    private int diametro;
    private boolean inflada;

    public Rueda(String material, int diametro, boolean inflada) {
        this.material = material;
        this.diametro = diametro;
        this.inflada = inflada;
    }

    public void inflar() {
        inflada = true;
        System.out.println("La rueda está inflada.");
    }

    public void desinflar() {
        inflada = false;
        System.out.println("La rueda está desinflada.");
    }
}
