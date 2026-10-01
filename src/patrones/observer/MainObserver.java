package patrones.observer;

public class MainObserver {
    public static void main(String[] args) {
        Sujeto canal = new Sujeto();
        Suscriptor s1 = new Suscriptor("Pepe");
        Suscriptor s2 = new Suscriptor("Pepa");
        Suscriptor s3 = new Suscriptor("Pepo");
        canal.suscribir(s1);
        canal.suscribir(s2);
        canal.suscribir(s3);
        canal.notificar("Te has suscrito al canal de pepecito");
    }
}
