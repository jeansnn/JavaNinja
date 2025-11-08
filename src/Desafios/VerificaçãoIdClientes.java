package Desafios;

import java.util.Scanner;

public class VerificaçãoIdClientes {
    public static void main(String[] args) {
        int[] idsValidos = {101, 293, 594, 432, 546};

        Scanner id = new Scanner(System.in);
        System.out.println("Digite o ID do cliente: ");
        int idDoCliente = id.nextInt();

        boolean idEncontrado = false;

        for (int i = 0; i < idsValidos.length; i++) {
            if (idsValidos[i] == idDoCliente) {
                idEncontrado = true;
                break;
            }

            }
        if (idEncontrado == true){
            System.out.println("Acesso permitido");
        }else {
            System.out.println("Acesso negado. ID não encontrado");
        }
    }
}
