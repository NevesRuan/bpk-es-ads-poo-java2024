package exercicio16;

public class TesteLoja {
    public static void main(String[] args) {
        Loja loja = new Loja("Supermercado ABC", "Rua das Flores, 123", "1234-5678");

        System.out.println(loja);

        loja.abrir();
        loja.fechar();
    }
}
