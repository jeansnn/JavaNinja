package NivelBasico;

public class Array {
    static void main(String[] args) {

        //Arrays são tipo "referencia"!
        //String inicializam como null
        String[] ninja = new String[6];
        ninja[0] = "Naruto Uzumaki";
        ninja[1] = "Sasuke Uchiha";
        ninja[2] = "Sakura Haruno";
        ninja[3] = "Hinata Hyuga";
        ninja[4] = "Kakashi Hatake";
        System.out.println(ninja[5]);

        //int inicializam como 0
        int[] idade = new int[2];
        idade[0] = 16;
        System.out.println(idade[0]);

        //boolean inicializam como false
        boolean[] verdadeiroOufalso = new boolean[1];
        System.out.println(verdadeiroOufalso[0]);

        //double inicializam como 0.0
        double[] flutuante = new double[0];
        System.out.println(flutuante[0]);

        String nomedoNinja1 = "Gaara do deserto";
        String nomedoNinja2 = "Rock Lee";

    }
}
