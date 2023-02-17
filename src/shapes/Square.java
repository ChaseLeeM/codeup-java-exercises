package shapes;

public class Square extends Rectangle {
    private int side;

    public Square(int side) {
        super(side, side);
    }


    public int getArea() {
        return side * side;
    }

    public int getPerimeter() {
        return 4 * side;
    }

}
