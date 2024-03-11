package ch1_abstractDT;

public class Circle implements Shape {

    int diameter = 0;

    @Override
    public double getArea() {
        double radius = (double) this.diameter / 2.0;
        return 3.14 * radius * radius;
    }

    @Override
    public void setLength(int len) {
        this.diameter = len;
    }

    @Override
    public double getPerimeter() {
        return this.diameter * 3.14;
    }
}
