package herencia;

public class Barco extends Transporte{
    private String tipodemotor;

    //constructor
    public Barco(double velocidad, String nombre, String tipodemotor) {
        super(velocidad, nombre);
        this.tipodemotor = tipodemotor;
    }

    //getters and setters
    public String getTipodemotor() {
        return tipodemotor;
    }

    public void setTipodemotor(String tipodemotor) {
        this.tipodemotor = tipodemotor;
    }

    //metodo
    @Override
    public void mostrar() {
        System.out.println("Soy un barco!");
    }
}
