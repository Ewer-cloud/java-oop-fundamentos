package excepciones;

public class EdadInvalidaException extends RuntimeException{
    public EdadInvalidaException(String mensaje){
        super(mensaje);
    }
}
