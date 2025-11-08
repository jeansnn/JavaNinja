package Desafios;

import Condicoes.SwitchCases;

import java.util.Scanner;

public class NivelDeAcessoDoUsuario {
    static void main(String[] args) {
        //Peça ao usuário para digitar seu cargo (ex: "Estagiário", "Desenvolvedor", "Gerente", "Administrador").

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu cargo: ");
        System.out.println("1. Estagiário");
        System.out.println("2. Desenvolvedor");
        System.out.println("3. Gerente");
        System.out.println("4. Administrador");

        int cargo = scanner.nextInt();
        //Utilize uma estrutura switch-case para verificar o cargo digitado.
        //
        //Para cada cargo, exiba uma mensagem correspondente:
        switch (cargo) {
            case 1:
                System.out.println("1. Estagiário");
                System.out.println("Acesso de leitura apenas.");
                break;
            case 2:
                System.out.println("2. Desenvolvedor");
                System.out.println("Acesso de leitura e escrita a repositórios de código.");
                break;
            case 3:
                System.out.println("3. Gerente");
                System.out.println("Acesso de leitura, escrita e aprovação de projetos.");
                break;
            case 4:
                System.out.println("4. Administrador");
                System.out.println("Acesso total ao sistema.");
                break;
            default:
                System.out.println("Nenhuma opção selecionada");
                System.out.println("Acesso Negado.");
        }
    }
}
