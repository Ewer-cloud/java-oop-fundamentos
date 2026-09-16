package colecciones;

import java.util.HashMap;

public class MainHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> catalogo = new HashMap<>();
        catalogo.put("Manzana", 5000);
        catalogo.put("Pera", 6000);
        catalogo.put("Yuca", 3500);
        catalogo.put("Arroz", 3400);
        catalogo.put("Manzana", 9999);

        for (String nombre : catalogo.keySet()) {
            System.out.println(nombre + " cuesta " + catalogo.get(nombre) + " pesos");
        }
        System.out.println(" ");
        System.out.println("EXISTEN LOS SIGUIENTES PRODUCTOS??");
        System.out.println("Yuca: " + catalogo.containsKey("Yuca"));
        System.out.println("Suero: " + catalogo.containsKey("Suero"));
    }
}
