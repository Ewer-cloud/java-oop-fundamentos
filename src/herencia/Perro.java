package herencia;

public class Perro extends Animal{
   //atributos exclusivos
    private String raza;

    //constructor
    public Perro(String nombre, int edad, String raza){
        super(nombre, edad);
        this.raza = raza;
    }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " dice: Guau guau dame comida hijo de perra");
    }

    //getter and setters
    public String getRaza(){
        return raza;
    }

    public void setRaza(String raza){
        this.raza = raza;
    }
}
