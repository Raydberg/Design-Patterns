package main;

public class Jaguar extends Animal implements IFelino {
    //Atributos
    private int edad;
    private float peso;

    public Jaguar() {
    }

    public Jaguar(int edad) {
        this.edad = edad;
    }

    public Jaguar(float peso) {
        this.peso = peso;
    }

    public Jaguar(int edad, float peso) {
        this.edad = edad;
        this.peso = peso;
    }
    public int getEdad() {
        return edad;
    }
    public int getEdad(int x) {
        return x;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Jaguar{" +
                "edad=" + edad +
                ", peso=" + peso +
                '}';
    }

    @Override
    public void rugir() {
        System.out.println("El jaguar ruge");
    }

    @Override
    public void maullar() {
        throw new UnsupportedOperationException("El jaguar no maulla");
    }

    @Override
    public void cazar() {
        System.out.println("El jaguar caza");
    }
}
