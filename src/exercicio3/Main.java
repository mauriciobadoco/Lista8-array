package exercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Prato prato = new Prato();
        System.out.println("**** CARDÁPIO ****");
        System.out.println("Digite 1 para ADICIONAR");
        System.out.println("Digite 2 para CONSULTAR");
        System.out.println("Digite 3 para EXCLUIR");
        System.out.println("Digite 4 para SAIR");
        int menu = input.nextInt();
        boolean verificaMenu = true;

        while (verificaMenu == true) {

            switch (menu) {
                case 1:
                    prato.adicionaPrato();
                    break;
                case 2:
                    prato.mostraPrato();
                    break;
                case 3:
                    prato.excluirPrato();
                    break;
                case 4:
                    verificaMenu = false;
                    break;
                default:
                    System.out.println("Opção inválida");

            }
        }
    }
}
