package e10atee12;

public class Esfera {
    private double raio;
    private static final double PI = 3.14;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double calcularVolume() {
        return (4.0 / 3.0) * PI * (this.raio * this.raio * this.raio);
    }
}
