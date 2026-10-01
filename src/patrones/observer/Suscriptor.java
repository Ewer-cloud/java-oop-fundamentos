package patrones.observer;

public class Suscriptor implements Observador{
    private String nombre;

    public Suscriptor(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void actualizar(String mensaje) {
        System.out.println(nombre + " recibio: " + mensaje);
    }
}
