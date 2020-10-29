package Test;


import Test.needForSpeed.Car;
import Test.needForSpeed.RaceMotorcycle;
import Test.needForSpeed.SportCar;

public class Main {
    public static void main(String[] args) {

        Car car = new Car(11, 150);
        car.drive(1);
        System.out.println(car.getFuel());

        SportCar SportCar = new SportCar(11, 150);
        SportCar.drive(1);
        System.out.println(SportCar.getFuel());

        RaceMotorcycle raceMotorcycle = new RaceMotorcycle(11, 150);
        raceMotorcycle.drive(1);
        System.out.println(raceMotorcycle.getFuel());
    }
}
