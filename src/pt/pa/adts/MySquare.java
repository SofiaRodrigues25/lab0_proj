package pt.pa.adts;

public class MySquare extends MyRectangle {
    public MySquare(String name, double x, double y, double size) {
        super(name, x, y, size, size);
    }

    public MySquare(String name, double size) {
        this(name, 0.0D, 0.0D, size);
    }

    @Override
    public boolean isPerfect() {
        double hypotenuse = this.getHypotenuse();
        return Math.abs(hypotenuse - Math.floor(hypotenuse)) <= 1.0E-8D;
    }

    @Override
    public String toString() {
        return "MyRectangle{" +
                "x=" + this.getX() +
                ", y=" + this.getY() +
                ", width=" + this.getWidth() +
                ", height=" + this.getHeight() +
                ", name='" + this.getName() + '\'' +
                ", area=" + getArea() +
                ", perimeter=" + getPerimeter() +
                ", hypotenuse=" + getHypotenuse() +
                ", isPerfect=" + isPerfect() +
                '}';
    }
}
