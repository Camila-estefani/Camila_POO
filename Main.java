package Vallegrande.edu.pe;

public class
Main {
    public static void main(String[] args) {
        Vehiculo miAuto = new Auto("Suzuki", "Derco");
        Vehiculo miMoto = new Motocicleta("Kawasaki", "Z1000");

        miAuto.encender();
        miMoto.encender();
    }
}