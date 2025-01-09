package Class24;

public class Rectangle extends Shape{

double width;
double height;

    public Rectangle(double side, double side1) {
        super();
    }

    @Override
    public double calculateArea() {
        double rectangle = width * height;

        return rectangle;
    }
}
