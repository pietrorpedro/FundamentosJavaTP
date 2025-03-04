package e9;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String senha = "ola123";

        boolean valido = false;
        do {
            
            System.out.println("Digite a senha: ");
            String tentativa = sc.nextLine();

            if (tentativa.equals(senha)) {
                valido = true;
            } else {
                System.out.println("Senha inválida!");
            }
        } while (!valido);

        System.out.println("Bem-vindo!");
    }
}
