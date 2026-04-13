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

    public void display() {
        System.out.println("Length: " + length + ", Width: " + width);
    }
}

class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public void display() {
        System.out.println("Radius: " + radius);
    }
}

public class level3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nChoose a question:");
            System.out.println("1. Create and display Rectangle");
            System.out.println("2. Calculate Rectangle area");
            System.out.println("3. Calculate Rectangle perimeter");
            System.out.println("4. Create and display Circle");
            System.out.println("5. Calculate Circle area");
            System.out.println("6. Calculate Circle circumference");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    createRectangle(scanner);
                    break;
                case 2:
                    calculateRectangleArea(scanner);
                    break;
                case 3:
                    calculateRectanglePerimeter(scanner);
                    break;
                case 4:
                    createCircle(scanner);
                    break;
                case 5:
                    calculateCircleArea(scanner);
                    break;
                case 6:
                    calculateCircleCircumference(scanner);
                    break;
                case 7:
                    running = false;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }

    public static void createRectangle(Scanner scanner) {
        System.out.print("Enter length: ");
        double length = scanner.nextDouble();
        System.out.print("Enter width: ");
        double width = scanner.nextDouble();
        Rectangle rect = new Rectangle(length, width);
        rect.display();
    }

    public static void calculateRectangleArea(Scanner scanner) {
        System.out.print("Enter length: ");
        double length = scanner.nextDouble();
        System.out.print("Enter width: ");
        double width = scanner.nextDouble();
        Rectangle rect = new Rectangle(length, width);
        System.out.println("Area: " + rect.getArea());
    }

    public static void calculateRectanglePerimeter(Scanner scanner) {
        System.out.print("Enter length: ");
        double length = scanner.nextDouble();
        System.out.print("Enter width: ");
        double width = scanner.nextDouble();
        Rectangle rect = new Rectangle(length, width);
        System.out.println("Perimeter: " + rect.getPerimeter());
    }

    public static void createCircle(Scanner scanner) {
        System.out.print("Enter radius: ");
        double radius = scanner.nextDouble();
        Circle circle = new Circle(radius);
        circle.display();
    }

    public static void calculateCircleArea(Scanner scanner) {
        System.out.print("Enter radius: ");
        double radius = scanner.nextDouble();
        Circle circle = new Circle(radius);
        System.out.println("Area: " + circle.getArea());
    }

    public static void calculateCircleCircumference(Scanner scanner) {
        System.out.print("Enter radius: ");
        double radius = scanner.nextDouble();
        Circle circle = new Circle(radius);
        System.out.println("Circumference: " + circle.getCircumference());
    }
}