public class Circle {
    double radius;

    double a,b;
    String color = "red";
    boolean filled;

    public Circle(double radius){
    }

    public Circle(double radius, String color, boolean filled){
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return this.radius;
    }
}
