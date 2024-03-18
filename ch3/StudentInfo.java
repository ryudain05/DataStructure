package ch3;

//상속 구현 예제
public class StudentInfo {
    protected String dept, stdNo, name;

    public StudentInfo(String dept, String stdNo, String name) {
        this.dept = dept;
        this.stdNo = stdNo;
        this.name = name;
    }

    public void getStdInfo() {
        System.out.println("** 학생 정보 출력 **");
        System.out.println("학과 : " + dept);
        System.out.println("학번 : " + stdNo);
        System.out.println("이름 : " + name);
    }
}
