package ch1_abstractDT;

public class AdtExample {

    public static void main(String[] args) {
        //정 사각형, 원의 면적과 둘레 가져오는 예제
        Shape a, b, c;

        a = new Square();
        b = new Circle();

        a.setLength(10);

        double area = a.getArea();
        double peri = a.getPerimeter();
        System.out.println("Square area = " + area + " perimeter = " + peri);

        b.setLength(10);

        area = b.getArea();
        peri = b.getPerimeter();
        System.out.println("Circle area = " + area + " perimeter = " + peri);
    }
}
