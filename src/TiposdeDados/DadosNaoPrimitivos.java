package TiposdeDados;

public class DadosNaoPrimitivos {
    static void main(String[] args) {

        String nome = "Naruto Uzumaki";
        String nomeCAPSLOCK= nome.toUpperCase(); //Colocar tudo em CAPSLOCK
        System.out.println("Esse texte esta em CAPSLOCK: " + nomeCAPSLOCK);
        System.out.println("Esse texte esta normal: " + nome);

        String aldeia = "Aldeia da Folha";
        String aldeiaMinusculo = aldeia.toLowerCase(); //Coloca tudo em minusculo
        System.out.println("Aldeia em Minusculo: " + aldeiaMinusculo);
        System.out.println("Aldeia normal: " + aldeia);
    }
}
