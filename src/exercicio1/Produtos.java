package exercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class Produtos {

    private String nome;
    private double preco;

    public Produtos(){

    }
    public Produtos(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    public ArrayList<Produtos> listaProdutos = new ArrayList<>();

    Scanner input = new Scanner(System.in);

    public void mostraMenu(){

    }
    public void abreMenu() {
        boolean parada = true;

        while (parada == true) {

            System.out.println("Digite 1 para adicionar");
            System.out.println("Digite 2 para exibir");
            System.out.println("Digite 3 para excluir");
            System.out.println("Digite 4 para sair");

            int escolha = input.nextInt();
            switch (escolha) {
                case 1:
                    adicionaProdutos();
                    break;
                case 2:
                    exibeProdutos();
                    break;
                case 3:
                    excluiProdutos();
                    break;
                case 4:
                    parada = false;
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }

    public void adicionaProdutos(){
        System.out.println("Digite o nome do produto");
        String prod = input.next();
        System.out.println("Digite o preço");
        Double valor = input.nextDouble();

        Produtos produto = new Produtos(prod,valor);
        listaProdutos.add(produto);
    }

    public void exibeProdutos(){
        for( Produtos p : listaProdutos){
            System.out.println(" O produto é: " + p.getNome()+ " E valor R$" + p.getPreco());
        }
    }
    public void excluiProdutos(){
        exibeProdutos();

        for(int i =0 ; i < listaProdutos.size(); i++){
            System.out.println("Qual produto quer excluir? ");
            String excluiProduto = input.next();
            if (listaProdutos.get(i).getNome().equals(excluiProduto)){
                listaProdutos.remove(i);
            }
        }

    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    @Override
    public String toString(){
        return nome;
    }
}