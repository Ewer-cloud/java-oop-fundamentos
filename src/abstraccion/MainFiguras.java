package abstraccion;

public class MainFiguras {
    public static void main(String[] args){

        FiguraGeometrica[] figuraGeometricas = new FiguraGeometrica[2];
        figuraGeometricas[0] = new Circulo(12);
        figuraGeometricas[1] = new Cuadrado(10);

        for (FiguraGeometrica figura: figuraGeometricas ){
            System.out.println("Area: " + figura.calcularArea());
            System.out.println("Perimetro: " + figura.calcularPerimetro());
            System.out.println(" ");
        }
    }
}
