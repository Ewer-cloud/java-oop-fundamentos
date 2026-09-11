package herencia;

public class Main {
    public static void main(String[] args) {

        Animal[] animales = new Animal[3];
        animales[0] = new Perro("Max", 3, "chichuahua");
        animales[1] = new Gato("Michu", 2, "Amarillo");
        animales[2] = new Animal("Generico", 1);

        for (Animal animal : animales){
            animal.hacerSonido();
        }
    }
}
