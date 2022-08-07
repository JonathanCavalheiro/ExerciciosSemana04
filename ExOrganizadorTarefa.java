package ExercicioLista4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ExOrganizadorTarefa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcaoSelecionada = 0;
        Map<String,String> atividades = new HashMap<>();

        do{
            System.out.println("1 - Cadastrar\n2 - Marcar como feito\n3 - Sair");
            opcaoSelecionada = input.nextInt();

            switch(opcaoSelecionada){
                case 1:
                    System.out.println("Informe a atividade:");
                    String nomeAtividade = input.next();
                    System.out.println("Informe o horário:");
                    String horarioAtividade = input.next();
                    atividades.put(nomeAtividade,horarioAtividade);
                    break;
                case 2:
                    System.out.println("Informe o nome da atividade:");
                    nomeAtividade = input.next();
                    if(atividades.containsKey(nomeAtividade)) {
                        atividades.remove(nomeAtividade);
                    } else {
                        System.out.println("Atividade não cadastrada\n");
                    }
                    break;
            }
        }while(opcaoSelecionada != 3);
    }
}
