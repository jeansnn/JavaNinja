package Condicoes;

public class Ternarios {
    static void main(String[] args) {
        short NumerodeMissoes = 1;
        String Niveldoninja = (NumerodeMissoes >= 10) ? "Esse ninja tem mais de 10 missoes. " : "Esse ninja tem menos de 10 missoes. ";
        System.out.println(Niveldoninja);
    }
}
