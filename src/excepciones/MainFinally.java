package excepciones;

public class MainFinally {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3};

        try {
            System.out.println(numeros[1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Esa posicion no existe en el array");
        } finally {
            System.out.println("Esto se ejecuta siempre, haya error o no");
        }
    }
}
