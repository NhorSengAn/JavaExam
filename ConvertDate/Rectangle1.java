import java.util.Scanner;

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

public class Rectangle1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for Rectangle dimensions
        System.out.print("Enter length of the rectangle: ");
        double rectangleLength = scanner.nextDouble();
        System.out.print("Enter width of the rectangle: ");
        double rectangleWidth = scanner.nextDouble();

        // Creating a Rectangle with user input
        Rectangle rectangle = new Rectangle(rectangleLength, rectangleWidth);
        System.out.println("Rectangle Area: " + rectangle.getArea());
        System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());

        // Taking user input for Square dimensions
        System.out.print("Enter side length of the square: ");
        double squareSide = scanner.nextDouble();

        // Creating a Square with user input
        Square square = new Square(squareSide);
        System.out.println("Square Area: " + square.getArea());
        System.out.println("Square Perimeter: " + square.getPerimeter());

        // Close the scanner to avoid resource leaks
        scanner.close();
    }
}
