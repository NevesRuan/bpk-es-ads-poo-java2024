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

    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("Computador ligado.");
        } else {
            System.out.println("Computador já está ligado.");
        }
    }

    public void desligar() {
        if (ligado) {
            ligado = false;
            System.out.println("Computador desligado.");
        } else {
            System.out.println("Computador já está desligado.");
        }
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

    public Boolean isLigado() {
        return ligado;
    }

    @Override
    public String toString() {
        return "Computador{" +
                "processador='" + processador + '\'' +
                ", memoriaRAM=" + memoriaRAM +
                ", armazenamento=" + armazenamento +
                ", ligado=" + ligado +
                '}';
    }
}
