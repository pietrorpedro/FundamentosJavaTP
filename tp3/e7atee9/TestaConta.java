package e7atee9;

public class TestaConta {
    
    public static void main(String[] args) {
        Conta conta = new Conta("Pietro", 1234, "21B", 1230.32, "14/04/2025");

        conta.saca(30.32);
        conta.deposita(30);
        System.out.println(conta.calculaRendimento());
    }
}
