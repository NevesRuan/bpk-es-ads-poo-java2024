package exercicio06;

public class Computador {
    private String processador;
    private Integer memoriaRAM;
    private Integer armazenamento;
    private Boolean ligado = false;

    public Computador(String processador, Integer memoriaRAM, Integer armazenamento) {
        this.processador = processador;
        this.memoriaRAM = memoriaRAM;
        this.armazenamento = armazenamento;
    }

    public String getProcessador() {
        return processador;
    }

    public Integer getMemoriaRAM() {
        return memoriaRAM;
    }

    public Integer getArmazenamento() {
        return armazenamento;
    }

    public Boolean getLigado() {
        return ligado;
    }

    public void ligar() {
        if (!ligado) {
            ligado = true;
        }
    }

    public void desligar() {
        if (ligado) {
            ligado = false;
        }
    }
}
