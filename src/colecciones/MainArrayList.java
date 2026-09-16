package colecciones;

import java.util.ArrayList;

public class MainArrayList {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Kiwi");
        nombres.add("Pepe");
        nombres.add("Michu");

        for (String nombre : nombres){
            System.out.println(nombre);
        }

        System.out.println("Cantidad: " + nombres.size());

        System.out.println("Segundo elemento de la lista: " + nombres.get(1));
        System.out.println("Existe Michu? : " + nombres.contains("Michu"));
        nombres.remove("Pepe");

        for (String nombre : nombres){
            System.out.println(nombre);
        }

        System.out.println("Cantidad: " + nombres.size());

    }
}
