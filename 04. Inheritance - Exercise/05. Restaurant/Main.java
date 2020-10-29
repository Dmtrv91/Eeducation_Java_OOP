package Test;


import Test.restaurant.Cake;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cake cake = new Cake("Garaj");

        System.out.println(cake.getName());
        System.out.println(cake.getCalories());
        System.out.println(cake.getGrams());
        System.out.println(cake.getPrice());

    }
}
