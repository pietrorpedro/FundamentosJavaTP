package e11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Valor inicial:");
        int inicial = sc.nextInt();

        System.out.println("Incremento:");
        int incremento = sc.nextInt();

        sc.close();

        int x = inicial;
        List<Integer> lista = new ArrayList<>();
        while (x <= 100) {
            lista.add(x);
            x += incremento;
        }

        System.out.println(lista.toString().replaceAll("[\\[\\]]", ""));
    }
}
