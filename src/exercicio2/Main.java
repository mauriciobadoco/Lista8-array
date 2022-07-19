package exercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean contador = true;
        Scanner input = new Scanner(System.in);
        Candidatos candidato = new Candidatos(null, 0);

        while (contador == true) {
            System.out.println("Deseja fazer o que? ");
            System.out.println("Digite 1 para Adicionar");
            System.out.println("Digite 2 para Incluir");
            System.out.println("Digite 3 para Excluir");
            System.out.println("Digite 4 para Sair");

            int escolhido = input.nextInt();

            switch (escolhido) {
                case 1:
                    candidato.adicionaCandidato();
                    break;
                case 2:
                    candidato.exibirCandidatos();
                    break;
                case 3:
                    candidato.exibirCandidatos();
                    break;
                case 4:
                    contador = false;
                    break;
                default:
                    System.out.println("Escolha inválida");
            }
        }
    }
}
