package herencia;

public class Animal {
    //atributos
    private String nombre;
    private int edad;

    //constructor
    public Animal(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }


    //getters and setters
    public String getNombre() {
        return nombre;
    }
    public int getEdad(){
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void  setEdad(int edad) {
        this.edad = edad;
    }


    //metodos
    public void hacerSonido(){
        System.out.println("El animal hace un sonido");
    }

    public void comer(){
        System.out.println(nombre + " esta comiendo");
    }
}
