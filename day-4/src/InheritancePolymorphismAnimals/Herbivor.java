package InheritancePolymorphismAnimals;

public class Herbivor extends Animal{
    // Variable shadowing
    private final String typeOfFood = "tumbuhan";
    private final String typeOfTeeth = "tumpul";

    public Herbivor(String name) {
        super(name);
    }

    @Override
    public void identifyMySelf() {
        System.out.println(String.format(
                "Hi I'm Herbivor, My Name is %s, My Food is '%s', I have %s teeth",
                super.getName(),
                typeOfFood,
                typeOfTeeth
        ));
    }
}
