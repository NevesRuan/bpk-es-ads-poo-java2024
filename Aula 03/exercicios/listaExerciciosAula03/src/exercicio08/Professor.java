package exercicio08;

public class Professor {
    private String nome;
    private String disciplina;
    private Double salario;

    public Professor(String nome, String disciplina, Double salario) {
        this.nome = nome;
        this.disciplina = disciplina;
        this.salario = salario;
    }

    public void darAula() {
        System.out.println("Aula dada.");
    }

    public void corrigirProvas() {
        System.out.println("Provas corrigidas.");
    }

    public String getNome() {
        return nome;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public Double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "nome='" + nome + '\'' +
                ", disciplina='" + disciplina + '\'' +
                ", salario=" + salario +
                '}';
    }
}
