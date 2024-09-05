package exercicio19;

public class TesteLivroDigital {
    public static void main(String[] args) {
        LivroDigital livroDigital = new LivroDigital("Kimi Suizou Wo Tabetai", "Yoru Sumino", 5.0);

        System.out.println(livroDigital);

        livroDigital.abrir();
        livroDigital.fechar();
    }
}
