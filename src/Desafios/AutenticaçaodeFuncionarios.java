package Desafios;

import java.util.Scanner;

public class AutenticaçaodeFuncionarios {
    static void main(String[] args) {

        String usuarioCorreto = "jean";
        String senhaCorreta = "lucca";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o Usuario: ");
        String usuario = scanner.nextLine();

        scanner.nextLine();

        System.out.println("Digite sua senha: ");
        String senha = scanner.nextLine();

        scanner.nextLine();

        if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)){
            System.out.println("Login bem-sucedido! Bem vindo(a)!");
        }else {
            System.out.println("Usuário ou senha inválida.");
        }
        scanner.close();
    }
}
