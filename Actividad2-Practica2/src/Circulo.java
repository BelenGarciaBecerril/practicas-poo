package Actividad2.Practica2;

public class Circulo extends FiguraCircular implements FigurasPlana {

    public Circulo(int radio) {
        super();
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public String imprimirFigura() {
        return "Se imprime un Circulo con radio: " + radio + ", area: " 
                + String.format("%.2f", calcularArea()) + ", perímetro: " 
                + String.format("%.2f", calcularPerimetro());
    }
}