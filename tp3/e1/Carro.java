package e1;

public class Carro {
    
    private String modelo;
    private int velocidadeMaxima;
    private int combustivel;

    public Carro(String modelo, int valocidadeMaxima) {
        this.modelo = modelo;
        this.velocidadeMaxima = valocidadeMaxima;
    }

    public void abastecer(int litros) {
        this.combustivel += litros;
    }

    public void exibirInfo() {
        System.out.println("Modelo: " + modelo + "\nVelocidade Máxima: " + velocidadeMaxima);
    }

}
