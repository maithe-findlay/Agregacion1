package Ejemplo1;

public class Motor {
    private String tipo;
    private int caballos;

    // Constructor
    public Motor(String tipo, int caballos) {
        this.tipo = tipo;
        this.caballos = caballos;
    }

    // Getters
    public String getTipo() {
        return tipo;
    }

    public int getCaballos() {
        return caballos;
    }

    public void mostrarInfo() {
        System.out.println("Tipo de motor: " + tipo);
        System.out.println("Caballos de fuerza: " + caballos);
    }
}
