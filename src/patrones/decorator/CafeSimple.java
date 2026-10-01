package patrones.decorator;

public class CafeSimple implements Cafe{

    @Override
    public double costo() {
        return 2.0;
    }

    @Override
    public String descripcion() {
        return "Cafe";
    }
}
