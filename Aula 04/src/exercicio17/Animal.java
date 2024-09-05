package exercicio17;

public class Animal {
    private String especie;
    private Integer idade;
    private Double peso;

    public Animal(String especie, Integer idade, Double peso) {
        this.especie = especie;
        this.idade = idade;
        this.peso = peso;
    }

    public String getEspecie() {
        return especie;
    }

    public Integer getIdade() {
        return idade;
    }

    public Double getPeso() {
        return peso;
    }

    public void alimentar() {
        System.out.println("Animal alimentado.");
    }

    public void dormir() {
        System.out.println("Animal dormindo.");
    }
}
