package InheritancePolymorphismAnimals;

public class Omnivor extends Animal{
    // Variable shadowing
    private final String typeOfFood = "semua";
    private final String typeOfTeeth = "tajam dan tumpul";

    public Omnivor(String name) {
        super(name);
    }

    @Override
    public void identifyMySelf() {
        System.out.println(String.format(
                "Hi I'm Omnivor, My Name is %s, My Food is '%s', I have %s teeth",
                super.getName(),
                typeOfFood,
                typeOfTeeth
        ));
    }
}
