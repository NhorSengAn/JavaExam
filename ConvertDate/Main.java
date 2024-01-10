class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }
}

class Square extends Rectangle {
    public Square(double side) {
        // Calling the constructor of the base class (Rectangle)
        super(side, side);
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating a Rectangle
        Rectangle rectangle = new Rectangle(4, 6);
        System.out.println("Rectangle Area: " + rectangle.getArea());
        System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());

        // Creating a Square
        Square square = new Square(5);
        System.out.println("Square Area: " + square.getArea());  // Inherited from Rectangle
        System.out.println("Square Perimeter: " + square.getPerimeter());  // Inherited from Rectangle
    }
}
