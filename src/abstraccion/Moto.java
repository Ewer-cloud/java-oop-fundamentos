package abstraccion;

public class Moto extends Vehiculo{
    //atributos
    //sin atributo

    //constructor
    public Moto(String marca, int velocidadMaxima){
        super(marca, velocidadMaxima);
    }

    //metodos
    @Override
    public void moverse(){
        System.out.println("La moto sizagea por el trafico");
    }

}
