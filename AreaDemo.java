import java.util.Scanner;

class Shape {

    double area(double radius) {
        return 3.14 * radius * radius;
    }

    double area(double length, double breadth) {
        return length * breadth;
    }

    double area(double base, double height, int x) {
        return 0.5 * base * height;
    }
}

public class AreaDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Shape s = new Shape();

        System.out.print("Enter radius: ");
        double r = sc.nextDouble();

        System.out.print("Enter length and breadth: ");
        double l = sc.nextDouble();
        double b = sc.nextDouble();

        System.out.print("Enter base and height: ");
        double base = sc.nextDouble();
        double h = sc.nextDouble();

        System.out.println("Area of Circle = " + s.area(r));
        System.out.println("Area of Rectangle = " + s.area(l, b));
        System.out.println("Area of Triangle = " + s.area(base, h, 1));

        sc.close();
    }
}