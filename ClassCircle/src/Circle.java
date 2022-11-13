public class Circle {
    double radius;
    String color ="red";

    public Circle(){
    }
    public Circle (double radius) {
        this.radius = radius;
    }
    public double getRadius(){return this.radius;}

    public double getArea(){return this.radius * Math.PI;}

}
