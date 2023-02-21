package shapes;

public abstract class Quadrilateral extends Shape implements Measurable{
    protected double width;
    protected double length;

    public void width(double width) {
        this.width = width;
    }
    public void length(double length){
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
