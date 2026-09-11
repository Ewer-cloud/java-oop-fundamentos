package interfaces;

public class Pato implements Volador, Nadador{
    private String nombre;
    private int edad;

    // cosntructor
    public Pato(String nombre, int edad){
        this.nombre = nombre;
        if (edad < 0){
            throw new IllegalArgumentException("No puedes tener edad negativa");
        }
        this.edad = edad;
    }

    @Override
    public void volar(){
        System.out.println(nombre + " Esta volando como to un veterano");
    }

    @Override
    public void nadar(){
        System.out.println(nombre + " Esta nadando como una sirenita :3 ");
    }
}
