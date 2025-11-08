package Desafios;

public class ListadeTarefas {
    static void main() {

        String[] listaDeTarefas = new String[5];

        listaDeTarefas[0] = "Corrigir o bug no login";
        listaDeTarefas[1] = "Desenvolver a nova tela de perfil";
        listaDeTarefas[2] = "Escrever testes para o módulo de pagamento";
        listaDeTarefas[3] = "Reunião de alinhamento com a equipe de design";
        listaDeTarefas[4] = "Atualizar a documentação da API";

        for (int i = 0; i < listaDeTarefas.length ; i++) {
            System.out.println((i + 1) + " - " + listaDeTarefas[i]);
        }


    }
}
