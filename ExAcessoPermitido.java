package ExercicioLista4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExAcessoPermitido {
    public static void main(String [] args){
      Scanner input = new Scanner(System.in);

      String senha = "2002";
      Boolean acesso = false;
      List<String> senhasDigitadas = new ArrayList<>();
      String senhaErrada ="";

      while (!acesso.equals(senha)) {
          System.out.println("Digite a senha:");
          senhaErrada = input.next();
          if(!senhaErrada.equals(senha)){
              System.out.println("Senha inválida\n");
              senhasDigitadas.add(senhaErrada);
          } else{
              System.out.println("Acesso permitido!!!");
              System.out.println("Total de senhas incorretas " +
                      "digitas foram de "+senhasDigitadas.size()+"!!");
              System.out.println("As senhas digitas erradas " +
                      "foram "+senhasDigitadas);
          }
      }

    }
}
