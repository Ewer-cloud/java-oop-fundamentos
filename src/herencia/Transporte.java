package herencia;

public class Transporte {
    private double velocidad;
    private String nombre;

    //constructor
    public Transporte(double velocidad, String nombre){
        this.velocidad = velocidad;
        this.nombre = nombre;
    }

    //metodos
    public void mostrar() {
        System.out.println("Soy un medio de Transporte");
    }

    //getter and setters
    public double getVelocidad() {
        return velocidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public void  setNombre(String nombre) {
        this.velocidad = velocidad;
    }
}
