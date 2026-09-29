package herencia;

public class Poliformismo {
    public static void main(String[] args) {
        Transporte [] transportes = new Transporte[4];
        transportes[0] = new Carro(120.5, "CarroMazda", 1975);
        transportes[1] = new Barco(1.852, "Lancha", "Transmision por eje");
        transportes[2] = new Carro(120, "Ferrari", 2007);
        transportes[3] = new Barco(2.450, "Ferri", "Industrial");

        for (Transporte transporte: transportes) {
            System.out.println("Mi velocidad es: " + transporte.getVelocidad());
            System.out.println("Mi nombre es: " + transporte.getNombre());
            System.out.println(" ");
        }
    }
}
