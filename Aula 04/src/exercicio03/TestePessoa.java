package exercicio03;

public class TestePessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João", 25, 1.75);

        System.out.println(pessoa);

        pessoa.apresentar();
    }
}
