import java.util.Scanner;

public class RectangleProgram {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner ac = new Scanner(System.in);
        System.out.println("Enter width: ");
        width = ac.nextFloat();
        System.out.println("Enter height: ");
        height = ac.nextFloat();
        float area = width * height;
        System.out.println("Area: " + area);
    }
}