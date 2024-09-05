package exercicio07;

public class TesteAluno {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Maria", "2023A001", "Engenharia");
        double[] notas = {8.5, 9.0, 7.5};
        System.out.println("Média: " + aluno.calcularMedia(notas));
    }
}
