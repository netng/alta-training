package Encapsulation.Fish;

public class FishApp {
    public static void main(String[] args) {
        Fish paus = new Fish("paus", "plankton");
        Fish cupang = new Fish("cupang", "cacing");
        Fish arwana = new Fish("arwana", "jangkrik");
        Fish sapuSapu = new Fish("sapu-sapu", "pelet");

        paus.showIdentity();
        cupang.showIdentity();
        arwana.showIdentity();
        sapuSapu.showIdentity();
    }
}
