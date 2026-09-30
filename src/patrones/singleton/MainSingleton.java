package patrones.singleton;

public class MainSingleton {
    public static void main(String[] args) {

        Configuracion c1 = Configuracion.getInstance();
        Configuracion c2 = Configuracion.getInstance();

        System.out.println(c1 == c2);

        c1.setIdioma("Ingles");

        System.out.println(c2.getIdioma());
        System.out.println(" ");

        ContadorVisitas k1 = ContadorVisitas.getInstance();
        ContadorVisitas k2 = ContadorVisitas.getInstance();
        k1.incrementar();
        k1.incrementar();
        k2.incrementar();
        System.out.println(k1.getVisitas());
    }
}
