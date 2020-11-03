package Identifiable;

import interfaces.Identifiable;

public class Robot implements Identifiable {
    String id;
    String model;

    public Robot(String id, String model) {
        this.id = id;
        this.model = model;
    }

    @Override
    public String getId() {
        return this.id;
    }

    public String getModel() {
        return this.model;
    }
}
