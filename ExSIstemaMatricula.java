package ExercicioLista4;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ExSIstemaMatricula {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        Set<String> vagasMat = new HashSet<>();
        int quantidadeVagas = 40;
        int opcaoUsuario = 0;
        int vagasRestantess = 0;
        String nome;

        do{
         System.out.println("\n1 - Realizar matrícula\n2 - Consultar quantidade de " +
                 "vagas\n3 - Listar pessoas matriculadas\n4 - Sair");
         opcaoUsuario = input.nextInt();
         switch(opcaoUsuario){
             case 1:
             System.out.println("Informe o nome do aluno: ");
             nome = input.next();
         if (vagasMat.size() < quantidadeVagas){
             vagasMat.add(nome);
             vagasRestantess = quantidadeVagas - vagasMat.size();
             System.out.println("Aluno matriculado com sucesso!! Ainda restam "+vagasRestantess+" vagas!!");
         } else {
             System.out.println("Infelizmente não temos mais vagas, mas fique de olho" +
                     " em nosso site para a aberuta de novas turmas!");
         }
             case 2:
                 System.out.println("Restam "+vagasRestantess+" vagas!!");
                 break;
             case 3:
                 vagasMat.forEach( lista ->{
                     System.out.println(lista);
                     break;
                 });

         }
        } while (opcaoUsuario != 4);

    }
}
