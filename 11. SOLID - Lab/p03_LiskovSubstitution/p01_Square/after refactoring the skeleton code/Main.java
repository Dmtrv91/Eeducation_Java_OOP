package p03_LiskovSubstitution.p01_Square;

public class Main {
    public static void main(String[] args) {

        Shape shape = new Rectangle(5, 25);
        shape.getArea();
        Shape shape1 = new Square(5);
        shape1.getArea();
    }
}
