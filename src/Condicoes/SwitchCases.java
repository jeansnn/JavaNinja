package Condicoes;

import java.util.Scanner;

public class SwitchCases {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha um personagem: ");
        System.out.println("1. Naruto Uzumaki");
        System.out.println("2. Sasuke Uchiha");
        System.out.println("3. Sakura Haruno");

        int EscolhadoUsuario = scanner.nextInt();

        System.out.println("Voce digitou o numero " + EscolhadoUsuario);

        switch (EscolhadoUsuario) {
            case 1:
                System.out.println("O usuario escolheu Naruto Uzumaki");
                break;
            case 2:
                System.out.println("O usuario escolheu Sasuke Uchiha");
                break;
            case 3:
                System.out.println("O usuario escolheu Sakura Haruno");
                break;
            default:
                System.out.println("Nenhum personagem foi escolhido");
        }

        scanner.close();
    }
}
