package Test.Car;

public class Audi extends CarImpl implements Rentable{
    private Integer minRentDay;
    private Double pricePerDay;

    public Audi(String mode, String color, Integer horsePower, String countryProduced, Integer minRentDay, Double pricePerDay) {
        super(mode, color, horsePower, countryProduced);
        this.minRentDay = minRentDay;
        this.pricePerDay = pricePerDay;
    }

    @Override
    public Integer getMinRentDay() {
        return this.minRentDay;
    }

    @Override
    public Double getPricePerDay() {
        return this.pricePerDay;
    }

    @Override
    public Double getPrice() {
        return this.pricePerDay;
    }

    @Override
    public String toString() {
        String format = "Minimum rental period of %d days. Price per day %f";
        return super.toString() + System.lineSeparator() + String.format(format, this.getMinRentDay(), this.getPricePerDay());
    }
}
