package Test.Car;

public class CarImpl implements Car {

    private String mode;
    private String color;
    Integer horsePower;
    private String countryProduced;

    public CarImpl(String mode, String color, Integer horsePower, String countryProduced) {
        this.mode = mode;
        this.color = color;
        this.horsePower = horsePower;
        this.countryProduced = countryProduced;
    }

    @Override
    public String getModel() {
        return this.mode;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public int getHorsePower() {
        return this.horsePower;
    }

    @Override
    public String countryProducer() {
        return this.countryProduced;
    }

    @Override
    public String toString() {
        String format = "This is %s produced in %s and have %d tires";
        return String.format(format, this.getModel(), this.countryProducer(), TIRES);
    }


    @Override
    public Double getPrice() {
        return null;
    }
}
