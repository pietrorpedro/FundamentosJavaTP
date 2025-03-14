package e10atee12;

public class Circulo {
    private double raio;
    private static final double PI = 3.14;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double calcularArea() {
        return PI * (this.raio * this.raio);
    }
}
