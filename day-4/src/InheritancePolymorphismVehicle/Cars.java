package InheritancePolymorphismVehicle;

public class Cars extends Vehicle{
    private Integer wheelCount;
    private String engineType;

    public Cars(String name, String withEngine, Integer wheelCount, String engineType) {
        super(name, withEngine);
        this.wheelCount = wheelCount;
        this.engineType = engineType;
    }

    @Override
    public void identifyMySelf() {
        System.out.println(String.format(
                "Hi I'm Car, " +
                        "My Name is %s ," +
                        "My Engine Status is '%s', " +
                        "I have %s wheels, " +
                        "My Engine Type = %s",
                super.getName(),
                super.getWithEngine(),
                wheelCount,
                engineType
        ));
    }
}
