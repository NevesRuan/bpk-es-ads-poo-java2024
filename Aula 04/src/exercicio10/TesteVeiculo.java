package exercicio10;

public class TesteVeiculo {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("Carro", "ABC-1234", "Azul");

        System.out.println(veiculo);

        veiculo.abastecer();
        veiculo.lavar();
    }
}
