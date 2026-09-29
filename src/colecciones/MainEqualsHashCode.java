package colecciones;

import java.util.Set;
import java.util.HashSet;

public class MainEqualsHashCode {
    public static void main(String[] args) {
        Libro a = new Libro("Rayuela", 1963);
        Libro b = new Libro("Rayuela", 1963);

        System.out.println(a==b);
        System.out.println(a.equals(b));

        Set<Libro> libros = new HashSet<>();
        libros.add(a);
        libros.add(b);
        System.out.println(libros.size());
    }
}
