package abstraccion;

public abstract class Vehiculo {
    private String marca;
    private int velocidadMaxima;

    //constructor
    public Vehiculo(String marca, int velocidadMaxima){
        this.marca = marca;
        this.velocidadMaxima = velocidadMaxima;
    }


    //Getters
    public String getMarca(){
        return marca;
    }

    public int getVelocidadMaxima(){
        return velocidadMaxima;
    }

    //metodo
    public void mostrarInfo(){
        System.out.println("Marca: " + marca + " || " + "velocidadMaxima: " + velocidadMaxima);
    }

    public abstract void moverse();
}
