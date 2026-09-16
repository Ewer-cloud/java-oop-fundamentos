package colecciones;

import java.util.ArrayList;

public class MainInventario {
    public static void main(String[] args) {
        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(new Producto("Pera", 5000, 40));
        productos.add(new Producto("Kiwi", 8000, 50));
        productos.add(new Producto("Aguacate", 6000, 34));
        productos.add(new Producto("Yuca", 4000, 95));

        for (Producto producto : productos){
            producto.mostrarDetalle();
        }

        System.out.println(" ");
        System.out.println("Elemento de la posicion 1: " + productos.get(0));
        System.out.println("La lista esta vacia? : " + productos.isEmpty());
        System.out.println("El producto aguacate esta en la lista? : " + productos.contains("Aguacate"));
        productos.remove(3);
        System.out.println(" ");

        for (Producto producto : productos){
            producto.mostrarDetalle();
        }
    }
}
