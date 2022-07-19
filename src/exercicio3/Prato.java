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

    public void adicionaPrato(){
        System.out.println("Digite o nome do prato");
        String prato = input.next();
        // do{
        System.out.println( "Deseja adicionar ingrediente? S | N");
        String confirma = input.next();
        if( confirma.equalsIgnoreCase("s")){
            System.out.println("Informe o ingrediente");
            String ingrediente = input.next();
            ingredientes.add(ingrediente);
        }else if(confirma.equalsIgnoreCase("n")){
        }

        boolean vazio;

        //  if{ingredientes.
        //  }

    }

    //  }

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
