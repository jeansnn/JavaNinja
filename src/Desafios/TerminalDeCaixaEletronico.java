package Desafios;

import java.util.Scanner;

public class TerminalDeCaixaEletronico {
    static void main(String[] args) {

        double saldo = 1500.00;

        System.out.println("1. Consultar Saldo");
        System.out.println("2. Realizar Saque");
        System.out.println("3. Realizar Depósito");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a opçao desejada: ");
        int Opção = scanner.nextInt();

        if (Opção == 1) {
            System.out.println("Saldo atual: " + saldo);
        } else if (Opção == 2){
            System.out.println("Qual valor deseja sacar? ");
            int sacar = scanner.nextInt();
            if (sacar <= saldo) {
                System.out.println("Voce sacou " + sacar + ", seu saldo restante é: " + (saldo - sacar));
            } else {
                System.out.println("Saldo Insuficiente");
            }
        } else {
            System.out.println("Qual o valor você deseja depositar? ");
            int depositar = scanner.nextInt();
            double novoSaldo = (saldo + depositar);
            System.out.println("Voce depositou " + depositar + ", seu novo saldo é de: " + novoSaldo);
        }


    }
}
