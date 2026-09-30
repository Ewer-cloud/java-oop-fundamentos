package patrones.singleton;

public class Configuracion {
    private static Configuracion instancia;
    private String idioma;

    private Configuracion(){
        this.idioma = "Espanol";
    }

    public static Configuracion getInstance() {
        if (instancia == null) {
            instancia = new Configuracion();
        }
        return instancia;
    }

    //getters and setters
    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
}

