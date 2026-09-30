package patrones.factory;

public class Perro extends Animal{

    public Perro (String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println("Gua!");
    }
}
