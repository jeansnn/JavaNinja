package Condicoes;

public class IfeElse {
    static void main() {

        String nome = "Naruto";
        String rank;
        int idade = 16;
        boolean hokage = false;
        short NumerodeMissoes = 11;


        if (NumerodeMissoes > 10) {
            System.out.println("Numero de missões: " + NumerodeMissoes);
            System.out.println("Naruto esta no nivel avançado! ");
        } else if (NumerodeMissoes <= 5) {
            System.out.println("Numero de missões: " + NumerodeMissoes);
            System.out.println("Naruto esta no nivel iniciante! ");
        } else {
            System.out.println("Numero de missões: " + NumerodeMissoes);
            System.out.println("Naruto esta no nivel medio! ");
            
        }
    }
}
