package shapes;

public class ShapesTest {

    public static void main(String[] args) {
        Measurable myShape = new Square(6);
        System.out.println("myShape.getPerimeter() = " + myShape.getPerimeter());
        System.out.println("myShape.getArea() = " + myShape.getArea());
        myShape = new Rectangle(4,5);
        System.out.println("myShape.getPerimeter() = " + myShape.getPerimeter());
        System.out.println("myShape.getArea() = " + myShape.getArea());
    }


//    public static void main(String[] args) {
//        Rectangle box1 = new Rectangle(4, 5);
//        Rectangle box2 = new Square(5);
//        System.out.println("box1.getArea() = " + box1.getArea());
//        System.out.println("box1.getPerimeter() = " + box1.getPerimeter());
//        System.out.println("box2.getArea() = " + box2.getArea());
//        System.out.println("box2.getPerimeter() = " + box2.getPerimeter());
//    }
}
