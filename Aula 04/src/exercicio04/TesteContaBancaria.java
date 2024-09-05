package exercicio04;

public class TesteContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("12345-6", 1000.0);

        System.out.println(conta);

        conta.depositar(500.0);
        conta.sacar(200.0);
        conta.sacar(2000.0);
    }
}
