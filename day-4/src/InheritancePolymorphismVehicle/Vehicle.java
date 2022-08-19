package InheritancePolymorphismVehicle;

public class Vehicle {
    private String name;
    private String withEngine;

    public Vehicle(String name, String withEngine) {
        this.name = name;
        this.withEngine = withEngine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWithEngine() {
        return withEngine;
    }

    public void setWithEngine(String withEngine) {
        this.withEngine = withEngine;
    }

    public void identifyMySelf() {
        System.out.println(String.format(
                "Hi I'm Parent of All Vehicles, " +
                        "My Name is %s ," +
                        "My Engine Status is '%s'",
                name, withEngine
        ));
    }
}
