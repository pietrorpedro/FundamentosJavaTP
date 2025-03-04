package e5;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Valor da compra: ");
        Double valor = sc.nextDouble();

        sc.close();

        Double descontoAplicado = 0.0;
        if (valor > 1000) {
            descontoAplicado = valor * 0.10;
        } else if (valor >= 500) {
            descontoAplicado = valor * 0.05;
        } else {
            descontoAplicado = 0.0;
        }

        Double total = valor - descontoAplicado;
        System.out.println("Desconto: " + descontoAplicado);
        System.out.println("Valor total: " + total);
    }
}
