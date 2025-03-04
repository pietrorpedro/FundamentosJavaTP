package e3;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Double valorDolar = 5.88;
        Double valorEuro = 6.20;
        Double valorLibra = 7.49;

        System.out.println("Valor em reais:");
        Double reais = sc.nextDouble();
        sc.nextLine();

        System.out.println("Moeda de destino (dolar, euro ou libra)");
        String moeda = sc.nextLine().toLowerCase();

        sc.close();

        Double resul = 0.0;
        if (moeda.equals("dolar")) {
            resul = reais / valorDolar;
        } else if (moeda.equals("euro")) {
            resul = reais / valorEuro;
        } else if (moeda.equals("libra")) {
            resul = reais / valorLibra;
        } else {
            System.out.println("inválido.");
            return;
        }

        System.out.println("Valor convertido: " + String.format("%.2f", resul));
    }
}
