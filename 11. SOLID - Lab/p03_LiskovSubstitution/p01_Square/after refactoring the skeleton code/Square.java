package p03_LiskovSubstitution.p01_Square;

public class Square extends Shape{

    private double site;

    public Square(double site) {
        this.site = site;
    }


    @Override
    public double getArea() {
        return this.site * this.site;
    }
}
