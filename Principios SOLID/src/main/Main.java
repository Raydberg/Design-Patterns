package main;

public class Main {
    public static void main(String[] args) {
        Presentacion presentacion = new Presentacion();
        Rectangulo rectangulo = new Rectangulo(10, 20);
        Triangulo triangulo= new Triangulo(50, 80);
        presentacion.area(rectangulo);
        presentacion.area(triangulo);
    }
}
