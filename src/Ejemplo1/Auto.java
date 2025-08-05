package Ejemplo1;


public class Auto {
    private String marca;
    private String modelo;
    private Motor motor;  // Relación de agregación

    // Constructor
    public Auto(String marca, String modelo, Motor motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
    }

    public void mostrarDetalles() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        motor.mostrarInfo(); // Usamos el motor agregado
    }
}

