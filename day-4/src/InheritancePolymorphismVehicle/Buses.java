package InheritancePolymorphismVehicle;

public class Buses extends Vehicle{
    private Integer wheelCount;
    private String privateBus;

    public Buses(String name, String withEngine, Integer wheelCount, String privateBus) {
        super(name, withEngine);
        this.wheelCount = wheelCount;
        this.privateBus = privateBus;
    }

    @Override
    public void identifyMySelf() {

        System.out.println(String.format(
                "Hi I'm Bus [%s], " +
                        "My Name is %s ," +
                        "My Engine Status is '%s', " +
                        "I have %s wheels, ",
                privateBus,
                super.getName(),
                super.getWithEngine(),
                wheelCount

        ));
    }
}
