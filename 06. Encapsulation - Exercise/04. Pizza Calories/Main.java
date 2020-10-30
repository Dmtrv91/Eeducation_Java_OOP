package Test;

import Test.pizza.Dough;
import Test.pizza.Pizza;
import Test.pizza.Topping;

import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pizza pizza = null;

        try {
            scanner.next();
            String name = scanner.next();
            int toppingsCount = scanner.nextInt();
            scanner.next();

            pizza = new Pizza(name, toppingsCount);
            Dough dough = new Dough(scanner.next(), scanner.next(), scanner.nextDouble());
            pizza.setDough(dough);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }

        scanner.nextLine();

        String input = scanner.nextLine();

        while (!input.equals("END") && pizza != null) {
            String[] tokens = input.split("\\s+");

            try {
                Topping topping = new Topping(tokens[1], Double.parseDouble(tokens[2]));
                pizza.addTopping(topping);
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }

            input = scanner.nextLine();
        }

        if (pizza != null) {
            System.out.println(pizza.toString());
        }
    }
}







