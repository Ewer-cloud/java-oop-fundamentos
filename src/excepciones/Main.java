package excepciones;

public class Main {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3};
        try{
            System.out.println(numeros[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Esa posicion no existe en el array");
        }

        System.out.println("El programa sigue corriendo despues del error ");
    }
}
