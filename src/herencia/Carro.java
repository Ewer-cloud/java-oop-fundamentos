package herencia;

public class Carro extends Transporte{
    private int modelo;

    //constructor
    public Carro(double velocidad, String nombre, int modelo) {
        super(velocidad, nombre);
        this.modelo = modelo;
    }
    //getters and setters

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    //metodos
    @Override
    public void mostrar(){
        System.out.println("Soy un Carro");
    }
}
