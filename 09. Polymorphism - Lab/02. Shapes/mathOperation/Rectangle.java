package mathOperation;

public class Rectangle extends Shape{

    private Double height;
    private Double width;

    public Rectangle(Double height, Double width) {
        this.height = height;
        this.width = width;
    }

    public final Double getHeight() {
        return height;
    }

    public final Double getWidth() {
        return width;
    }

    @Override
    public void calculatePerimeter() {
        Double result = 2 * (this.getHeight() + this.getWidth());
        super.setPerimeter(result);
    }

    @Override
    public void calculateArea() {
        Double result = this.getHeight() * this.getWidth();
        super.setArea(result);
    }
}
