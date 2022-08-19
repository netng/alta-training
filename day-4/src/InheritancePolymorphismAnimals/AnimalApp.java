package InheritancePolymorphismAnimals;

public class AnimalApp {
    public static void main(String[] args) {
        Animal animal = new Animal("Binatang");
        Animal kambing = new Herbivor("Kambing");
        Animal singa = new Carnivor("Singa");
        Animal ayam = new Omnivor("Ayam");

        animal.identifyMySelf();
        System.out.println();
        kambing.identifyMySelf();
        singa.identifyMySelf();
        System.out.println();
        ayam.identifyMySelf();
    }
}
