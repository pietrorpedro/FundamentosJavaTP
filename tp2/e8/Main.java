package e8;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Lado 1: ");
        Double lado1 = sc.nextDouble();

        System.out.println("Lado 2: ");
        Double lado2 = sc.nextDouble();

        System.out.println("Lado 3: ");
        Double lado3 = sc.nextDouble();
        
        sc.close();

        
        if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0) {
            System.out.println("Os lados devem ser maiores que 0");

        // se o triangulo é realmente um triangulo
        } else if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            // lados iguais
            if (lado1.equals(lado2) && lado2.equals(lado3)) {
                System.out.println("triângulo equilátero.");

            // dois lados mesmas medidas
            } else if (lado1.equals(lado2) || lado1.equals(lado3) || lado2.equals(lado3)) {
                System.out.println("triângulo isósceles.");

            // lados diferentes
            } else {
                System.out.println("triângulo escaleno.");
            }
        } else {
            System.out.println("triângulo inválido.");
        }
    }
}
