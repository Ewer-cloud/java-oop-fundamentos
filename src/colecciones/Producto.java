package colecciones;

public class Producto {
    private String nombre;
    private double precio;
    private int cantidad;

    public Producto(String nombre, double precio, int cantidad){
        this.nombre = nombre;
        if (precio < 0){
            throw new IllegalArgumentException("No puede tener precio negativo");
        }
        this.precio = precio;
        if (cantidad < 0){
            throw new IllegalArgumentException("No puede haber cantida negativa");
        }
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void mostrarDetalle(){
        System.out.println(nombre + " | " + "$" + precio + " | " + "Cantidad : " + cantidad);
    }

    @Override
    public String toString() {
        return nombre + " | $" + precio + " | Cantidad: " + cantidad;
    }
}
