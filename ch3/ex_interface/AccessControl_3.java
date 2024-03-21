package ch3.ex_interface;


//접근 제어자를 사용한 클래스 예제(1)
class AccessControl_3 {
    private int num1, num2, sum;
    private double ave;

    AccessControl_3(int a, int b) {
        this.num1 = a;
        this.num2 = b;
    }

    private int getSum() {
        sum = num1 + num2;
        return sum;
    }

    private double getAve() {
        ave = sum / 2.0;
        return ave;
    }
}
