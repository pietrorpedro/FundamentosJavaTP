package e1;


public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", 150);
        carro.abastecer(10);
        carro.exibirInfo();
    }
}