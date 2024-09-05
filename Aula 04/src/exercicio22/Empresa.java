package exercicio22;

public class Empresa {
    private String nome;
    private String CNPJ;
    private Integer numeroFuncionarios;

    public Empresa(String nome, String CNPJ, Integer numeroFuncionarios) {
        this.nome = nome;
        this.CNPJ = CNPJ;
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public String getNome() {
        return nome;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public Integer getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    public void contratarFuncionario() {
        numeroFuncionarios++;
    }

    public void demitirFuncionario() {
        if (numeroFuncionarios > 0) {
            numeroFuncionarios--;
        } else {
            System.out.println("Não há funcionários para demitir.");
        }
    }
}
