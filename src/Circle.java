import java.text.DecimalFormat;

public class Circle extends Shape implements Resizeable {
    private double radius = 1.0;
    private DecimalFormat decimalFormat = new DecimalFormat("#.##");

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius = "
                + decimalFormat.format(getRadius())
                + ", which is a subclass of "
                + super.toString();
    }

    public void increaseSize(double percent) {
        this.radius = getRadius() * percent / 100 + getRadius();
    }
}
