package patrones.observer;

import java.util.ArrayList;
import java.util.List;

public class Sujeto {
    private List<Observador> observadors;

    public Sujeto () {
        observadors = new ArrayList<>();
    }

    public void suscribir(Observador o) {
        observadors.add(o);
    }

    public void notificar(String mensaje) {
        for (Observador o : observadors) {
            o.actualizar(mensaje);
        }
    }
}
