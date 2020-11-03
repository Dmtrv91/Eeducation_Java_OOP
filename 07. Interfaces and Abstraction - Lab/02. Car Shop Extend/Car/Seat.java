package car;

import interfaces.Sellable;

public class Seat extends CarImpl implements Sellable {

    private Double price;

    public Seat(String mode, String color, Integer horsePower, String countryProduced, Double price) {
        super(mode, color, horsePower, countryProduced);
        this.price = price;
    }

    @Override
    public Double getPrice(){
        return this.price;
    }

    @Override
    public String toString() {
        String format = "%s sells for %f";
        return super.toString() + System.lineSeparator() + String.format(format, this.getModel(), this.getPrice());
    }
}
