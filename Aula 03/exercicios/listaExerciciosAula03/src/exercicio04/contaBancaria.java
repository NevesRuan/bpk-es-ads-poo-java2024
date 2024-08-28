package exercicio04;

public class ContaBancaria {
    private String numeroConta;
    private Double saldo;

    public ContaBancaria(String numeroConta, Double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public void depositar(Double valor) {
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado. Saldo atual: R$" + saldo);
    }

    public void sacar(Double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado. Saldo atual: R$" + saldo);
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public Double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "numeroConta='" + numeroConta + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
