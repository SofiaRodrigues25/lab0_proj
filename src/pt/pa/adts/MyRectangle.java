package pt.pa.adts;

public class MyRectangle implements Shapeable{
    private double x, y, width, height;
    private String name;

    public MyRectangle(String name, double width, double height) {
        this.width = width;
        this.height = height;
        this.name = name;
    }

    public MyRectangle(String name, double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.name = name;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return ((width * 2) + (height * 2));
    }

    @Override
    public double getHypotenuse() {
        return Math.sqrt(Math.pow(this.width, 2.0D) + Math.pow(this.height, 2.0D));
    }

    @Override
    public boolean isPerfect() {
        if(height < width)
        {
            if(height >= (width/2)) {
                return true;
            }
            else {
                return false;
            }
        }
        else
        {
            if(width >= (height/2)) {
                return true;
            }
            else {
                return false;
            }
        }
    }

    @Override
    public String toString() {
        return "MyRectangle{" +
                "x=" + x +
                ", y=" + y +
                ", width=" + width +
                ", height=" + height +
                ", name='" + name + '\'' +
                ", area=" + getArea() +
                ", perimeter=" + getPerimeter() +
                ", hypotenuse=" + getHypotenuse() +
                ", isPerfect=" + isPerfect() +
                '}';
    }
}
