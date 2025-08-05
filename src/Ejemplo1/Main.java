package Ejemplo1;

public class Main {
    public static void main(String[] args) {

        // Creamos primero el objeto motor (independiente)
        Motor motorTurbo = new Motor("Turbo", 200);

        // Creamos el auto y le pasamos el motor ya creado
        Auto auto = new Auto("Toyota", "Supra", motorTurbo);

        // Mostramos los detalles
        auto.mostrarDetalles();
    }
}
