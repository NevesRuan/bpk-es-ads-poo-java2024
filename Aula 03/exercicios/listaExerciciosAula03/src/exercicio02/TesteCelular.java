package exercicio02;

public class TesteCelular {
    public static void main(String[] args) {
        Celular celular = new Celular("Apple", "iPhone 14", 4000);

        System.out.println(celular);

        celular.ligar();
        System.out.println("Celular ligado? " + celular.isLigado());

        celular.desligar();
        System.out.println("Celular ligado? " + celular.isLigado());
    }
}
