package exercicio04;

public class TesteContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("12345", 1000.0);
        System.out.println("Saldo atual: " + conta.getSaldo());
        conta.depositar(500.0);
        System.out.println("Saldo atual: " + conta.getSaldo());
        conta.sacar(200.0);
        System.out.println("Saldo atual: " + conta.getSaldo());
    }
}
