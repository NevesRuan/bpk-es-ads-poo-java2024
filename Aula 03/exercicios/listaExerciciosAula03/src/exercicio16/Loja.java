package exercicio16;

public class Loja {
    private String nome;
    private String endereco;
    private String telefone;
    private Boolean aberta = false;

    public Loja(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public void abrir() {
        if (!aberta) {
            aberta = true;
            System.out.println("Loja aberta.");
        } else {
            System.out.println("A loja já está aberta.");
        }
    }

    public void fechar() {
        if (aberta) {
            aberta = false;
            System.out.println("Loja fechada.");
        } else {
            System.out.println("A loja já está fechada.");
        }
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public Boolean isAberta() {
        return aberta;
    }

    @Override
    public String toString() {
        return "Loja{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", telefone='" + telefone + '\'' +
                ", aberta=" + aberta +
                '}';
    }
}
