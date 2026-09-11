package herencia;

public class Gato extends Animal{
    private String color;

    //constructor
    public Gato(String nombre, int edad, String color) {
        super(nombre, edad);
        this.color = color;
    }

    @Override
    public void hacerSonido(){
        System.out.println(getNombre() + " dice: Miau");
    }
}
