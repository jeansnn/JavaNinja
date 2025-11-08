package Desafios;

import java.util.Scanner;

public class newdesafio {
    static void main() {

        Scanner caixadetexto = new Scanner(System.in);

        System.out.println("Digite o nome do ninja: ");
        String nomedoninja = caixadetexto.nextLine();
        System.out.println("O nome do ninja é: " + nomedoninja);

        System.out.println("Escreva aqui a idade do seu ninja: ");
        int idadedoninja = caixadetexto.nextInt();

        System.out.println("A idade do ninja é: " + idadedoninja);

        if (idadedoninja >= 18) {
            System.out.println("Esse ninja ja é maior de idade");
        } else {
            System.out.println("Esse ninja é menor de idade");
        }


        caixadetexto.close();
    }
}