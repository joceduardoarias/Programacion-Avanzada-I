package Objetos;

public enum MarcaDeAuto {
    TOYOTA("Toyota"),
    FORD("Ford"),
    TESLA("Tesla"),
    BMW("BMW");

    private String nombre;

    // Constructor
    MarcaDeAuto(String nombre) {
        this.nombre = nombre;
    }

    // Método para obtener el nombre de la marca
    public String getNombre() {
        return nombre;
    }
}
