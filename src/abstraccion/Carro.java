package abstraccion;

public class Carro extends Vehiculo{
    //atributos exclusivos de Carro
    private int numPuertas;

    //constructor
    public Carro(String marca, int velocidadMaxima, int numPuertas){
        super(marca, velocidadMaxima);
        this.numPuertas = numPuertas;
    }

    @Override
    public void moverse(){
        System.out.println("El carro conduce por la carretera");
    }
}
