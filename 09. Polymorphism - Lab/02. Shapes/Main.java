import mathOperation.*;

import java.awt.geom.Area;

public class Main {
    public static void main(String[] args) {

        Shape rectangle = new Rectangle(5.0, 5.0);
        rectangle.calculateArea();
        rectangle.calculatePerimeter();
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());


        Shape circle = new Circle(5.0);
        circle.calculateArea();
        circle.calculatePerimeter();
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
    }
}

