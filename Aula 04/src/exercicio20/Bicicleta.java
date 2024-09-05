package exercicio20;

public class Bicicleta {
    private String marca;
    private String modelo;
    private Integer tamanhoRoda;

    public Bicicleta(String marca, String modelo, Integer tamanhoRoda) {
        this.marca = marca;
        this.modelo = modelo;
        this.tamanhoRoda = tamanhoRoda;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Integer getTamanhoRoda() {
        return tamanhoRoda;
    }

    public void pedalar() {
        System.out.println("Pedalando...");
    }

    public void frear() {
        System.out.println("Freando...");
    }
}
