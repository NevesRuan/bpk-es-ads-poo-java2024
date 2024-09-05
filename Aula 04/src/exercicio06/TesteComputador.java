package exercicio06;

public class TesteComputador {
    public static void main(String[] args) {
        Computador computador = new Computador("Intel i7", 16, 512);
        computador.ligar();
        System.out.println("Computador está ligado: " + computador.getLigado());
    }
}
