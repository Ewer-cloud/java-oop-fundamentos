package patrones.decorator;

public class MainDecorator {
    public static void main(String[] args) {
        Cafe base = new CafeSimple();
        Cafe conLeche = new ConLeche(base);
        Cafe conLecheYChocolate = new ConChocolate(conLeche);

        System.out.println(conLecheYChocolate.descripcion());
        System.out.println(conLecheYChocolate.costo());
    }
}
