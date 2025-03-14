package e10atee12;

public class TestarFiguras {
    
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        circulo.setRaio(3.0);
        System.out.println(circulo.calcularArea());

        Esfera esfera = new Esfera();
        esfera.setRaio(5.0);
        System.out.println(esfera.calcularVolume());
    }
}
