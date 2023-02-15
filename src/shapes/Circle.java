package shapes;

public class Circle {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * (this.radius * this.radius);
    }

    public double getCircumference() {
        return 2 * Math.PI * this.radius;
    }


    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println(circle.getArea());
        System.out.println(circle.getCircumference());

    }

}
