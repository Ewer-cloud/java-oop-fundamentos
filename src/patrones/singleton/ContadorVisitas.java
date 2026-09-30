package patrones.singleton;

public class ContadorVisitas {
    private static ContadorVisitas instancia;
    private int visitas;

    private ContadorVisitas() {
        this.visitas = 0;
    }

    public static ContadorVisitas getInstance(){
        if (instancia == null) {
            instancia = new ContadorVisitas();
        }
        return instancia;
    }

    public void incrementar() {
        visitas += 1;
    }

    public int getVisitas() {
        return visitas;
    }
}
