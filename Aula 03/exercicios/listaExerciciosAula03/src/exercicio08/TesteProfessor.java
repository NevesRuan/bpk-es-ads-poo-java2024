package exercicio08;

public class TesteProfessor {
    public static void main(String[] args) {
        Professor professor = new Professor("Carlos", "Matemática", 3000.0);

        System.out.println(professor);

        professor.darAula();
        professor.corrigirProvas();
    }
}
