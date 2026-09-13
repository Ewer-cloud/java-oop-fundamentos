package excepciones;

public class MainPersonalizada {
    public static void main(String[] args){
        Rana r1 = new Rana("Pepe", -9);

        try{
            r1.validarEdad();
        } catch (EdadInvalidaException e) {
            System.out.println("Error personalizado: " + e.getMessage());
        }

        System.out.println("El program sigue corriendo");
    }
}
