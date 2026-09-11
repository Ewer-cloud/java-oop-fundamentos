package basicos;

public class Persona {
    //atributos
    String nombre;
    int edad;
    String ciudad;

    //constructor
    public Persona(String nombre, int edad, String ciudad){
        this.nombre = nombre;
        this.edad = edad;
        this.ciudad = ciudad;
    }

    //metodos
    public void saludar(){
        System.out.println("Hola soy " + nombre + ", quien eres tu?");
    }

    public void cumplirAnios(){
        edad += 1;
        System.out.println("Feliz cumpleanos numero " + edad);
    }



    public static void main(String[] args){
        Persona persona1 = new Persona("Kiwi", 67, "KiwiLand");
        Persona persona2 = new Persona("Pepe", 34, "RacconCity");

        System.out.println("soy " + persona1.nombre + " y tengo " + persona1.edad + " soy de " + persona1.ciudad);
        persona1.saludar();
        persona1.cumplirAnios();
        System.out.println("soy " + persona2.nombre + " y sobrevivi en " + persona2.ciudad);

    }
}
