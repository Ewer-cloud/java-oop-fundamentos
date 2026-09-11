package abstraccion;

public class Main {
    public static void main(String[] args) {
        Vehiculo[] vehiculos = new Vehiculo[2];
        vehiculos[0] = new Carro("Ford", 200, 4);
        vehiculos[1] = new Moto("Yamaha", 180);

        for (Vehiculo vehiculo: vehiculos){
            vehiculo.mostrarInfo();
            vehiculo.moverse();
        }
    }
}
