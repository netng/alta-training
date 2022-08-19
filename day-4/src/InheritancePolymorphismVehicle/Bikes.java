package InheritancePolymorphismVehicle;

public class Bikes extends Vehicle{
    private Integer wheelCount;

    public Bikes(String name, String withEngine, Integer wheelCount) {
        super(name, withEngine);
        this.wheelCount = wheelCount;
    }

    @Override
    public void identifyMySelf() {
        System.out.println(String.format(
                "Hi I'm Bike, " +
                        "My Name is %s ," +
                        "My Engine Status is '%s', " +
                        "I have %s wheels",
                super.getName(),
                super.getWithEngine(),
                wheelCount
        ));
    }
}
