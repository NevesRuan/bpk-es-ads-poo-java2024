package exercicio17;

public class TesteAnimal {
    public static void main(String[] args) {
        Animal animal = new Animal("Gato", 2, 4.5);

        System.out.println(animal);

        animal.alimentar();
        animal.dormir();
    }
}
