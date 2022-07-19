package exercicio2;

import java.util.ArrayList;
import java.util.Scanner;

public class Candidatos {

    private String numMatricula;
    private double nota;

    Scanner input = new Scanner(System.in);

    ArrayList<Candidatos> candidato = new ArrayList<>();

    public Candidatos(String numMatricula, double nota) {
        this.numMatricula = numMatricula;
        this.nota = nota;
    }

    public void adicionaCandidato() {
        System.out.println("Qual o número de Matricula: ");
        String matricula = input.next();
        System.out.println("Qual a nota do candidato ");
        double nota = input.nextDouble();

        System.out.println("Você adicionou a Matricula: " + matricula + " com nota: " + nota);

        Candidatos novoCandidato = new Candidatos(matricula, nota);
        candidato.add(novoCandidato);
    }

    public void exibirCandidatos() {
        for (int i = 0; i < candidato.size(); i++) {
            System.out.println("Matricula" + candidato.get(i).getNumMatricula() + "Nota" + candidato.get(i).getNota());
        }
    }

    public void excluiCandidatos() {
        System.out.println("Qua a matrícula será excluída:");
        exibirCandidatos();
        String mat = input.next();
        for (int i = 0; i < candidato.size(); i++) {
            if (candidato.get(i).getNumMatricula().equals(mat)) {
                candidato.remove(i);
            }
        }
    }

    public String getNumMatricula() {
        return numMatricula;
    }

    public void setNumMatricula(String numMatricula) {
        this.numMatricula = numMatricula;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}


