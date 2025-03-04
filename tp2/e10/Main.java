package e10;

import java.util.Random;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int numeroAleatorio = random.nextInt(1, 101);
        
        boolean ganhou = false;
        do {
            System.out.println("Digite a sua tentativa:");
            int tentativa = sc.nextInt();

            if (tentativa == numeroAleatorio) {
                ganhou = true;
            } else {

                if (tentativa < numeroAleatorio) {
                    System.out.println("Seu número é menor do que o número aleatório");
                }
                if (tentativa > numeroAleatorio) {
                    System.out.println("Seu número é maior do que o número aleatório");
                }

            }
        } while (!ganhou);

        System.out.println("Você ganhou! O número era: " + numeroAleatorio);
        sc.close();
    }
}
