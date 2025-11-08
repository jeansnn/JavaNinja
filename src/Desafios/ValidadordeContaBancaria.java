package Desafios;

import java.util.Scanner;

public class ValidadordeContaBancaria {
    static void main(String[] args) {

        Scanner numerodaconta = new Scanner(System.in);
        System.out.println("Digite o numero da sua conta: ");
        String conta = numerodaconta.nextLine();


        if (conta.length() == 8 ) {
            System.out.println("Numero de conta Valido.");
        } else {
            System.out.println("Erro: O número da conta deve conter exatamente 8 dígitos.");
        }

        numerodaconta.close();
    }
}
