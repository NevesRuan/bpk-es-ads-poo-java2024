package exercicio02;

public class Celular {
    private String marca;
    private String modelo;
    private Integer capacidadeBateria;
    private Boolean ligado = false;

    public Celular(String marca, String modelo, Integer capacidadeBateria) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadeBateria = capacidadeBateria;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Integer getCapacidadeBateria() {
        return capacidadeBateria;
    }

    public Boolean getLigado() {
        return ligado;
    }

    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("Celular ligado.");
        }
    }

    public void desligar() {
        if (ligado) {
            ligado = false;
            System.out.println("Celular desligado.");
        }
    }
}
