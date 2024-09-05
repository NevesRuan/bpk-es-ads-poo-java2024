package exercicio05;

public class Cachorro {
    private String nome;
    private String raca;
    private Integer idade;

    public Cachorro(String nome, String raca, Integer idade) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }

    public Integer getIdade() {
        return idade;
    }

    public void latir() {
        System.out.println("Au au!");
    }

    public void correr() {
        System.out.println("Correndo...");
    }
}
