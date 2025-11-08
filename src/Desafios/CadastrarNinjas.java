package Desafios;

import java.util.Scanner;

public class CadastrarNinjas {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroMAX = 5;
        String[] ninjas = new String[numeroMAX];

        int ninjasCadastrados = 0;
        int opcao = 0;

        while (opcao != 3) {
            System.out.println("1 - Cadastrar Ninjas");
            System.out.println("2 - Listar Ninjas");
            System.out.println("3 - Sair");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    if (ninjasCadastrados < numeroMAX) {
                        System.out.println("Digite o nome do ninja: ");
                        String nomeDoNinja = scanner.nextLine();
                        ninjas[ninjasCadastrados] = nomeDoNinja;
                        ninjasCadastrados++;
                        System.out.println("Ninja Cadastrado com sucesso!");
                    }else  {
                        System.out.println("A lista de ninjas esta cheia! ");
                    }
                    break;
                case 2:
                    if (ninjasCadastrados == 0) {
                        System.out.println("Nenhum ninja foi encontrada!");
                    }else  {
                        for (int i = 0; i < ninjas.length; i++) {
                            System.out.println(ninjas[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Estamos terminando o programa");
                    break;
                default:
                    System.out.println("Opção invalida!");
                    break;
            }
        }

        scanner.close();

    }
}
