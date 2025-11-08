package Condicoes;

import java.util.Scanner;

public class Scanners {
    static void main() {

        Scanner CaixadeTexto = new Scanner(System.in) ;

        System.out.println("Digite o nome do ninja: ");
        String nomedoninja = CaixadeTexto.nextLine();
        System.out.println("O nome do ninja é: " + nomedoninja);

        CaixadeTexto.close();
    }
}
