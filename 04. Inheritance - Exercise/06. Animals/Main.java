package Test;


import Test.animals.*;

public class Main {
    public static void main(String[] args) {


        Dog dog = new Dog("Dog", 150, "Female");
        Cat cat = new Cat("Cat", 140, "Female");
        Frog frog = new Frog("Frog", 130, "Female");
        Kitten kitten = new Kitten("Kitten", 120);
        Tomcat tomcat = new Tomcat("Tomcat", 110);

        System.out.println(dog.toString());
        System.out.println(cat.toString());
        System.out.println(frog.toString());
        System.out.println(kitten.toString());
        System.out.println(tomcat.toString());
    }
}
