package InheritancePolymorphismAnimals;

public class Carnivor extends Animal{
    // Variable shadowing
    private final String typeOfFood = "daging";
    private final String typeOfTeeth = "tajam";

    public Carnivor(String name) {
        super(name);
    }

    @Override
    public void identifyMySelf() {
        System.out.println(String.format(
                "Hi I'm Carnivor, My Name is %s, My Food is '%s', I have %s teeth",
                super.getName(),
                typeOfFood,
                typeOfTeeth
        ));
    }
}
