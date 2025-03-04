package e2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Nota bimestral 1:");
        Double nota1 = sc.nextDouble();
        
        System.out.println("Nota bimestral 2:");
        Double nota2 = sc.nextDouble();

        System.out.println("Nota bimestral 3:");
        Double nota3 = sc.nextDouble();

        System.out.println("Nota bimestral 4:");
        Double nota4 = sc.nextDouble();

        sc.close();

        Double media = (nota1 + nota2 + nota3 + nota4) / 4;

        if (media >= 7) {
            System.out.println("Aluno aprovado!");
        } else if (media <= 6.9 && media >= 5) {
            System.out.println("Aluno em recuperação!");
        } else if (media < 5) {
            System.out.println("Aluno reprovado!");
        }
    }
}
