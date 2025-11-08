package Desafios;

import java.util.Scanner;

public class CalculadoraDeBonus {
    static void main(String[] args) {

        double salario = 5000;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a nota do funcionario de 0 a 10: ");
        short nota = scanner.nextShort();

        double percentualBonus = (nota >= 8) ? 0.15 : 0.05;

        double BonusFinal = salario * percentualBonus;

        String status = (nota >= 8 ) ? "Alta performance." : "Performance regular";

        //No final, exiba o salário, a nota de performance, o status, o percentual do bônus e o valor final do bônus para o funcionário.
        System.out.println("Salario: R$" + salario);
        System.out.println("Nota de performance: " + nota);
        System.out.println("Status: " + status);
        System.out.println("Percentual do Bonus: " + percentualBonus);
        System.out.println("Bonus final: R$" + BonusFinal);

        scanner.close();
    }
}
