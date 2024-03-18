package ch3;

import ch1_abstractDT.Circle;
import ch1_abstractDT.Shape;
import ch1_abstractDT.Square;

public class InterfaceExample1 {

    public static void main(String[] args) {
        //a = new Shape();
        Shape a = new Square();
        Square sq = new Square();

        a.setLength(10);
        sq.setLength(10);

        double area1 = a.getArea();
        double area2 = sq.getArea();

        System.out.println("Shape area = " + area1);
        System.out.println("Square area = " + area2);

        a = new Circle(); //sq = new Circle();
        Circle cr = new Circle();

        //인터페이스는 여러가지 도형으로 사용 가능함
        a.setLength(10);
        cr.setLength(10);

        area1 = a.getArea();
        area2 = cr.getArea();

        System.out.println("Shape area = " + area1);
        System.out.println("Circle area = " + area2);
    }
}
