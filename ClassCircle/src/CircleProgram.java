import java.util.Scanner;

public class CircleProgram {
    public static void main(String[] args) {
        double radius;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your radius: ");
        radius = sc.nextDouble();
        Circle circle = new Circle(radius);
        System.out.println("The Radius: " + radius);
        System.out.println("The Area: " + circle.getArea());
    }
}
