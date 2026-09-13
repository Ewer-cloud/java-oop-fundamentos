package excepciones;

public class MainThrow {
    public static void main(String[] args) {
        //me apoyare de la clase "Rana"
        Rana r = new Rana("Pepe", -9);

        try {
            r.validarEdad();
        } catch (IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("El progrema sigue corriendo");
    }
}
