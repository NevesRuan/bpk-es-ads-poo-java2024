package exercicio04;

public class ContaBancaria {
    private String numeroConta;
    private Double saldo;

    public ContaBancaria(String numeroConta, Double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void depositar(Double valor) {
        saldo += valor;
    }

    public void sacar(Double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
}
