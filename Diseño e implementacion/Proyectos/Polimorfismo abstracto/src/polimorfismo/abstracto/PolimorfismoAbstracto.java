package polimorfismo.abstracto;

public class PolimorfismoAbstracto {

    public static void main(String[] args) {
        Figura Cuadrado = new Cuadrado (8);
        Figura Rectangulo = new Rectangulo(10, 6);
        Figura Triangulo = new Triangulo(10, 5);
        Figura Circulo = new Circulo(8);
        
        double areaCuadrado = Cuadrado.calcularArea();
        double areaRectangulo = Rectangulo.calcularArea();
        double areaTriangulo = Triangulo.calcularArea();
        double areaCirculo = Circulo.calcularArea();
        
        System.out.println("Area del Cuadrado: " + areaCuadrado);
        System.out.println("Area del Rectangulo: " + areaRectangulo);
        System.out.println("Area del Triangulo: " + areaTriangulo);
        System.out.println("Area del Ciruclo: " + areaCirculo);        
    }
    
}
