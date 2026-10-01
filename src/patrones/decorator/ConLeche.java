package patrones.decorator;

public class ConLeche extends CafeDecorador{

    public ConLeche(Cafe cafe) {
        super(cafe);
    }

    @Override
    public double costo() {
        return cafeEnvuelto.costo() + 0.5;
    }

    @Override
    public String descripcion() {
        return cafeEnvuelto.descripcion() + " con leche";
    }
}
