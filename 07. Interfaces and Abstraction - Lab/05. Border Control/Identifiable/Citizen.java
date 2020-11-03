package Identifiable;

import interfaces.Identifiable;

public class Citizen implements Identifiable {

    private String name;
    private Integer age;
    private String id;

    public Citizen(String name, Integer age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public Integer getAge() {
        return this.age;
    }

    @Override
    public String getId() {
        return this.id;
    }
}
