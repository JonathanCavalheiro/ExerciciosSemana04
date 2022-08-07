package ExercicioList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Lista {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        List<String> nomes = new ArrayList<>();
        String entradUsuario= "";

        while (!entradUsuario.equals("fim")){
            System.out.println("Para finalizar o programa digite fim!");
            System.out.println("Informe um nome: ");
            entradUsuario = input.next();
            nomes.add(entradUsuario);
        }
       // nomes.sort(Comparator.naturalOrder());

        for (String nome : nomes){
            System.out.println(nome);
        }
    }
}
