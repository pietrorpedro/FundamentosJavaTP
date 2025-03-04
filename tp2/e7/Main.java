package e7;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Salário bruto anual:");
        Double salario = sc.nextDouble();

        sc.close();

        Double taxa = 0.0;
        if (salario <= 30000) {
            taxa = 0.0;
        } else if (salario <= 60000) {
            taxa = (salario - 30000) * 0.15;
        } else if (salario <= 96000) {
            taxa = (salario - 60000) * 0.20;
        } else {
            taxa = (salario - 96000) * 0.25;
        }

        Double liquido = salario - taxa;

        System.out.println("Imposto total: " + taxa);
        System.out.println("Salário líquido: " + liquido);
    }
}
