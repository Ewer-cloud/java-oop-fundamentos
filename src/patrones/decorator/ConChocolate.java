package patrones.decorator;

public class ConChocolate extends CafeDecorador{

    public ConChocolate(Cafe cafe) {
        super(cafe);
    }

    @Override
    public double costo() {
        return cafeEnvuelto.costo() + 0.8;
    }

    @Override
    public String descripcion() {
        return cafeEnvuelto.descripcion() + " con chocolate";
    }
}
