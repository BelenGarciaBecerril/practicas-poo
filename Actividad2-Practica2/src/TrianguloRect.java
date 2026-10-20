package Actividad2.Practica2;

public class TrianguloRect extends FiguraRecta implements FigurasPlana {

    public TrianguloRect(int ancho, int alto) {
        super();
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public double calcularArea() {
        return (ancho * alto) / 2.0;
    }

    @Override
    public double calcularPerimetro() {
        double hipotenusa = Math.sqrt(Math.pow(ancho, 2) + Math.pow(alto, 2));
        return ancho + alto + hipotenusa;
    }

    @Override
    public String imprimirFigura() {
        return "Se imprime un Triangulo con alto: " + alto + ", ancho: " + ancho + ", area: " 
                + String.format("%.2f", calcularArea()) + ", perímetro: " 
                + String.format("%.2f", calcularPerimetro());
    }
}