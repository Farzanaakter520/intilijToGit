package Class24;

public class Circle extends Shape{
    private final double radius;

    public Circle(double radius) throws NegativeNumberException {
        if (radius < 0) {
            throw new NegativeNumberException("Negative number not Supported");
        }
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
