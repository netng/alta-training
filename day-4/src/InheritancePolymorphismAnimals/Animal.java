package InheritancePolymorphismAnimals;

import java.lang.reflect.AnnotatedWildcardType;

public class Animal {
    private String name;
    protected String typeOfFood;
    private String typeOfTeeth;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void identifyMySelf() {
        System.out.println(String.format("Hi I'm Parent of All Animal, My Name is %s", name));
    }
}
