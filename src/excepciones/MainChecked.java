package excepciones;

import java.io.FileReader;
import java.io.FileNotFoundException;

public class MainChecked {
    public static void main(String[] args) {
        try {
            FileReader lector = new FileReader("archivo_que_no_existe.txt");
        } catch (FileNotFoundException e) {
            System.out.println("No se encontró el archivo: " + e.getMessage());
        }
    }
}
