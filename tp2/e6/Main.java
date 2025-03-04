package e6;

import java.time.Year;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o ano:");
        int ano = sc.nextInt();

        sc.close();

        if (Year.isLeap(ano)) {
            System.out.println("É um ano bissexto!");
        } else {
            System.out.println("Não é um ano bissexto!");
        }
    }
}
