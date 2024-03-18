package ch3;

import ch1_abstractDT.Circle;
import ch1_abstractDT.Shape;
import ch1_abstractDT.Square;

public class InterfaceExample2 {

    public static void main(String[] args) {
        Shape a1, a2;
        Square sq1, sq2;
        Circle cr1, cr2;

        a1 = new Square(); //sq1 = new Square();
        a2 = new Square(); //sq2 = new Square();
        a1.setLength(10);  //sq1.setLength(10);
        a2.setLength(20);  //sq2.setLength(20);
        double areaSum = addArea(a1, a2);
        System.out.println("Square area sum = " + areaSum);

        a1 = new Circle(); //cr1 = new Circle();
        a2 = new Circle(); //cr2 = new Circle();
        a1.setLength(10); //cr1.setLength(10);
        a2.setLength(20); //cr2.setLength(20);
        areaSum = addArea(a1, a2);
        System.out.println("Circle area sum = " + areaSum);
    }

    static double addArea(Shape a, Shape b) {
        return a.getArea() + b.getArea();
    }

}
