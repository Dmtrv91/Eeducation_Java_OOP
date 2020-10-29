package Test;

import Test.hero.BladeKnight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int age = Integer.parseInt(sc.nextLine());

        BladeKnight child = new BladeKnight(name, age);

        System.out.println(child.getClass());
        System.out.println(child.getUsername());
        System.out.println(child.getLevel());



    }
}
