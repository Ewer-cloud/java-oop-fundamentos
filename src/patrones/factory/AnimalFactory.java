package patrones.factory;

public class AnimalFactory {

    public static Animal crearAnimal(String tipo, String nombre) {
        if (tipo.equals("perro")) {
            return new Perro(nombre);
        } else if (tipo.equals("gato")) {
            return new Gato(nombre);
        }
        return null;
    }
}
