package exercicio08;

public class TesteProfessor {
    public static void main(String[] args) {
        Professor professor = new Professor("Dr. João", "Matemática", 5000.0);
        professor.darAula();
        professor.corrigirProvas();
    }
}
