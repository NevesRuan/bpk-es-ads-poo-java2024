package exercicio11;

public class TesteCidade {
    public static void main(String[] args) {
        Cidade cidade = new Cidade("São Paulo", 12000000, "SP");

        System.out.println(cidade);

        cidade.aumentarPopulacao(5000);
        cidade.diminuirPopulacao(2000);
    }
}
