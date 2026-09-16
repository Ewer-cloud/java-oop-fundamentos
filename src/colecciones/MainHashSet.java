package colecciones;

import java.util.HashSet;

public class MainHashSet {
    public static void main(String[] args) {
        HashSet<String> ciudades = new HashSet<>();
        ciudades.add("Cartagena");
        ciudades.add("Baranquilla");
        ciudades.add("Valledupar");
        ciudades.add("Sincelejo");
        ciudades.add("Valledupar");

        System.out.println(" ");
        System.out.println("Tamano del HashSet: " + ciudades.size());
        System.out.println(" ");
        System.out.println("Las siguientes ciudades fueron visitadas?");
        System.out.println("Cartagena: " + ciudades.contains("Cartagena"));
        System.out.println("PereiraP: " + ciudades.contains("Pereira"));
    }
}
