package exercicio20;

public class TesteBicicleta {
    public static void main(String[] args) {
        Bicicleta bicicleta = new Bicicleta("Caloi", "Elite", 29);

        System.out.println(bicicleta);

        bicicleta.pedalar();
        bicicleta.frear();
    }
}
