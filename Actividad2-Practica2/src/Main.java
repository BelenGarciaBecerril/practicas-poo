package Actividad2.Practica2;

public class Main {
    public static void main(String[] args) {
        Figura2D f = new TrianguloRect(3, 4);
        System.out.println("Se imprime una FiguraPlana...");
        System.out.println(f.imprimirFigura());
        
        f = new Circulo(3);
        System.out.println("Se imprime una FiguraPlana...");
        System.out.println(f.imprimirFigura());
    }
}