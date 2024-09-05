package exercicio07;

public class TesteAluno {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Maria", "2023A001", "Engenharia");

        System.out.println(aluno);

        double[] notas = {8.5, 7.0, 9.0};
        double media = aluno.calcularMedia(notas);
        System.out.println("Média: " + media);
    }
}
