package e12;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a frase:");
        String frase = sc.nextLine();

        sc.close();

        String[] palavras = frase.split(" ");
        int qtdPalavras = 0;

        for (int i = 0; i < palavras.length; i++) {
            qtdPalavras++;
            System.out.println("Palavra " + (i + 1) + ": " + palavras[i]);
        }

        System.out.println("Total de palavras: " + qtdPalavras);
    }
}
