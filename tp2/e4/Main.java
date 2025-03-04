package e4;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ano do seu nascimento (ex: 1994)");
        int ano = sc.nextInt();
        sc.nextLine();

        System.out.println("Mês do seu nascimento (ex: 2)");
        int mes = sc.nextInt();
        sc.nextLine();

        System.out.println("Dia do seu nascimento (ex: 21)");
        int dia = sc.nextInt();
        sc.nextLine();

        sc.close();

        LocalDate nascimento = LocalDate.of(ano, mes, dia);
        LocalDate hoje = LocalDate.now();

        long dias = ChronoUnit.DAYS.between(nascimento, hoje);

        System.out.println("Dias: " + dias);
    }
}
