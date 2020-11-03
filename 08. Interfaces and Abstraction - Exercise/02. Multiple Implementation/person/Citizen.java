package person;

import interfaces.Birthable;
import interfaces.Identifiable;
import interfaces.Person;

public class Citizen implements Identifiable, Birthable, Person {

    private String name;
    private Integer age;
    private String id;
    private String birthDate;

    public Citizen(String name, Integer age, String id, String birthDate) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.birthDate = birthDate;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Integer getAge() {
        return this.age;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public String getBirthDate() {
        return this.birthDate;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
