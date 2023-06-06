package polimorfismo.abstracto;

public class Triangulo extends Figura {
    private double altura;
    private double ancho;
    
    public Triangulo(double altura, double ancho){
        this.altura = altura;
        this.ancho = ancho;
    }
    
    public double calcularArea(){
        return (altura * ancho)/2;
    }
}
