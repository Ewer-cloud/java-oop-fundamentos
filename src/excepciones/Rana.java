package excepciones;

public class Rana {
    //atributos
    private String name;
    private int edad;

    //constructor
    public Rana(String name, int edad){
        this.name = name;
        this.edad = edad;
    }

    //metodo
    public void validarEdad(){
        if (edad < 0){
            //throw new IllegalArgumentException("No puedes tener edad negativa");
            throw new EdadInvalidaException("No puedes tener edad negativa");
        } else {
            System.out.println("Edad validad: " + edad);
        }
    }
}
