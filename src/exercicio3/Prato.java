package exercicio3;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Prato {
    String nome;
    ArrayList<String> ingredientes = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    public  Prato(){

    }

    public Prato(String nome, ArrayList<String> ingredientes) {
        this.nome = nome;
        this.ingredientes = ingredientes;
    }

    ArrayList<Prato> novoPrato = new ArrayList<>();

    public void adicionaPrato(){
        System.out.println("Digite o nome do prato");
        String prato = input.next();

            ArrayList<String> ingredientes = new ArrayList<>();
            System.out.println("Informe o ingrediente");
            String ingrediente1 = input.next();
            ingredientes.add(ingrediente1);

                boolean contador = true;
                while (contador == true) {
                    System.out.println("Deseja adicionar mais ingredientes? ");
                    System.out.println("Digite 1 para Adicionar");
                    System.out.println("Digite 2 para Sair");
                    int escolhido = input.nextInt();
                    switch (escolhido) {
                        case 1:
                            System.out.println("Digite o ingrediente");
                            ingrediente1 = input.next();
                            ingredientes.add(ingrediente1);
                            break;
                        case 2:
                            contador = false;
                            break;
                        default:
                            System.out.println("Escolha inválida");
                    }
                }
        System.out.println("Você adicionou o Prato: " + prato + "\n Ingredientes: " + ingredientes);

        Prato p1 = new Prato(prato,ingredientes);
                novoPrato.add(p1);

    }

    public void mostraPrato(){
        for(Prato n : novoPrato ){
            System.out.println("Nome Prato: " + getNome()+ "\n Ingredientes " + getIngredientes());
        }
    }
    public void excluirPrato(){
        mostraPrato();
        System.out.println("Qual prato deseja excluir");
        String pratoFora = input.next();

        for(int i=0 ; i < novoPrato.size(); i++){
            novoPrato.get(i).equals(pratoFora);
            novoPrato.remove(i);


        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<String> ingredientes) {
        this.ingredientes = ingredientes;
    }
}
