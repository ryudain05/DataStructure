package ch3.ex_interface;


//상속 구현 예제
public class Ex_Student {

    public static void main(String[] args) {
        StudentInfo s_i = new StudentInfo("컴퓨터과학과", "20072135", "홍길동");
        StudentScore s_s = new StudentScore("컴퓨터과학과", "200721405", "홍길순", 91, 80, 95);

        s_i.getStdInfo();
        System.out.println();
        s_s.getStdInfo();
        s_s.getStdScore();
    }

}
