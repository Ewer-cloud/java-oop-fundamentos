package herencia;

public class MainHerencia {
    public static void main(String[] args) {
        Carro Carro1 = new Carro(120.5, "CarroMazda", 1975);
        Barco Barco1 = new Barco(1.852, "Lancha", "Transmision por eje");
        Carro Carro2 = new Carro(120, "Ferrari", 2007);
        Barco Barco2 = new Barco(2.450, "Ferri", "Industrial");

        System.out.println("Informacion de Carro 1");
        System.out.println("Mi modelo es: " + Carro1.getModelo());
        System.out.println("Mi velocidad es: " + Carro1.getVelocidad());
        System.out.println("Mi nombre es: " + Carro1.getNombre());

        System.out.println(" ");

        System.out.println("Informacion de Carro 2");
        System.out.println("Mi modelo es: " + Carro2.getModelo());
        System.out.println("Mi velocidad es: " + Carro2.getVelocidad());
        System.out.println("Mi nombre es: " + Carro2.getNombre());

        System.out.println(" ");

        System.out.println("Informacion de Barco 1");
        System.out.println("Mi Tipo de motor es: " + Barco1.getTipodemotor());
        System.out.println("Mi velocidad es: " + Barco1.getVelocidad());
        System.out.println("Mi nombre es: " + Barco1.getNombre());

        System.out.println(" ");

        System.out.println("Informacion de Barco 2");
        System.out.println("Mi Tipo de motor es: " + Barco2.getTipodemotor());
        System.out.println("Mi velocidad es: " + Barco2.getVelocidad());
        System.out.println("Mi nombre es: " + Barco2.getNombre());
    }
}
