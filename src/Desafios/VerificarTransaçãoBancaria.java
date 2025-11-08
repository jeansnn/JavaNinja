package Desafios;

import java.util.Scanner;

public class VerificarTransaçãoBancaria {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o codigo da transação: ");
        System.out.println("1. 1");
        System.out.println("2. 12");
        System.out.println("3. 123");
        System.out.println("4. Cancelar");

        int codigo = scanner.nextInt();

        switch (codigo) {
            case 1:
                System.out.println("codigo 1: 1");
                System.out.println("Transação aprovada.");
                break;
            case 2:
                System.out.println("codigo 2: 12");
                System.out.println("Transação em análise.");
                break;
            case 3:
                System.out.println("codigo 3: 123");
                System.out.println("Transação recusada. Tente novamente mais tarde.");
                break;
            case 4:
                System.out.println("Transação cancelada pelo usuário.");
                break;
            default:
                System.out.println("Código de status inválido.");
        }

        scanner.close();
    }
}
