package ExercicioLista4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExCalcularDivisores {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        int numero;
        List<Integer> divisores = new ArrayList<>();

        System.out.println("Digite um n�mero inteiro para calcular " +
                "todos seus divisores:");
            numero = input.nextInt();
        for (int divisao = 1; divisao <= numero; divisao++ ){
            if (numero % divisao != 0){
            } else {
                divisores.add(divisao);
            }
        }
        System.out.println("Os n�meros divisores de "+numero+" s�o "+divisores);
    }
}
