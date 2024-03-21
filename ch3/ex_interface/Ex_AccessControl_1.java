package ch3.ex_interface;


//접근 제어자를 사용하지 않는 클레스 예제(2)
public class Ex_AccessControl_1
{
    public static void main(String[] args) {
        AccessControl_1 test1 = new AccessControl_1(10, 20);
        System.out.println("sum = " + test1.getSum());
        System.out.println("average = " + test1.getAve());
    }
}
