package abstraccion;

public class Circulo implements FiguraGeometrica {
    private double radio;

    //constructor
    public Circulo(double radio){
        this.radio = radio;
    }

    @Override
    public double calcularArea(){
        return Math.PI * radio * radio;
    }

    @Override
    public double calcularPerimetro(){
        return 2 * Math.PI * radio;
    }
}
