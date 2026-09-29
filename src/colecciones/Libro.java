package colecciones;

import java.util.Objects;

public class Libro {
    private String nombre;
    private int anio;

    public Libro(String nombre, int anio) {
        this.nombre = nombre;
        this.anio = anio;
    }

    //getters

    public String getNombre() {
        return nombre;
    }

    public int getAnio() {
        return anio;
    }

    @Override
    public boolean equals(Object obj) {
        Libro otro = (Libro) obj;
        return this.nombre.equals(otro.getNombre()) && this.anio == otro.getAnio();
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, anio);
    }
}
