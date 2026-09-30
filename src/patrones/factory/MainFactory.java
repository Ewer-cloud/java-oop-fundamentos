package patrones.factory;

public class MainFactory {
    public static void main(String[] args) {
        Animal a1 = AnimalFactory.crearAnimal("perro", "Firulais");
        Animal a2 = AnimalFactory.crearAnimal("gato", "Michi");

        a1.hacerSonido();
        a2.hacerSonido();
    }
}
