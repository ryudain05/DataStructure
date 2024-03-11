package ch1_abstractDT;

public class Square implements Shape {

    int length = 0;

    @Override
    public double getArea() {
        return this.length + this.length;
    }

    @Override
    public void setLength(int len) {
        this.length = len;
    }

    @Override
    public double getPerimeter() {
        return this.length * 4;
    }
}
