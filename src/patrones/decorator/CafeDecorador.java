package patrones.decorator;

public abstract class CafeDecorador implements Cafe {
    protected Cafe cafeEnvuelto;

    public CafeDecorador(Cafe cafe) {
        this.cafeEnvuelto = cafe;
    }
}