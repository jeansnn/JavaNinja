package Desafios;

import java.util.Scanner;

public class RegistroDeTransacoes {
    public static void main(String[] args) {
        //Criar um menu que permita ao usuário registrar
        // até 20 depósitos em uma conta e depois listá-los.
        Scanner scanner = new Scanner(System.in);

        int depositosFeitos = 0;
        int maxTransacoes = 20;
        int opcao = 0;
        double[] depositos = new double[maxTransacoes];

        while (opcao != 3) {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Registrar Deposito");
            System.out.println("2 - Listar Depositos");
            System.out.println("3 - Sair ");
            System.out.println("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                   if (depositosFeitos < maxTransacoes) {
                       System.out.println("Digite o valor do depósito: ");
                       depositos[depositosFeitos] = scanner.nextDouble();
                       scanner.nextLine();
                       depositosFeitos++;
                   }else {
                       System.out.println("Você atingiu o valor máximo de transações!");

                   }
                   break;
                case 2:
                    if (depositosFeitos == 0 ){
                        System.out.println("Voê ainda não fez nenhum depósito!");
                    }else {
                        int i;
                        for (i = 0; i < maxTransacoes; i++){
                            System.out.println("Deposito " + (i + 1) + ": " + depositos[i]);
                        }
                    }
                    break;
                case 3:
                    break;
                default:

                    break;
            }






        }
        System.out.println("Saindo...");


    }
}
