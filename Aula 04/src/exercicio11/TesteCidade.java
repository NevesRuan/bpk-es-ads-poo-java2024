package exercicio11;

public class TesteCidade {
    public static void main(String[] args) {
        Cidade cidade = new Cidade("São Paulo", 12000000, "SP");
        System.out.println("População atual: " + cidade.getPopulacao());

        cidade.aumentarPopulacao(5000);
        System.out.println("População atual: " + cidade.getPopulacao());

        cidade.diminuirPopulacao(2000);
        System.out.println("População atual: " + cidade.getPopulacao());
    }
}
