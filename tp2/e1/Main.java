package e1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome completo:");
        String nomeCompleto = sc.nextLine();
        
        System.out.println("Digite a sua idade");
        int idade = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Digite o nome do seu pai:");
        String nomePai = sc.nextLine();

        System.out.println("Digite o nome da sua mãe:");
        String nomeMae = sc.nextLine();
        
        sc.close();
        
        System.out.println("Nome completo: " + nomeCompleto);
        System.out.println("Idade: " + idade);
        System.out.println("Nome do pai: " + nomePai);
        System.out.println("Nome da mãe: " + nomeMae);


        if (nomeCompleto.length() > nomePai.length()) {
            System.out.println("O seu nome é maior do que o nome do seu pai");
        }
        if (nomeCompleto.length() > nomeMae.length()) {
            System.out.println("O seu nome é maior do que o nome da sua mãe");
        }
    }
}
