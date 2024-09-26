package OOP;

class MyInfo_01 { // 자바에서 public class 가 2개 일 수 없음
    public String name;
    public int number;
    public String dept;
}

public class ConstructorTest_01 {
    public static void main(String[] args) {
        // MyInfo_01 클래스 형인 객체 my 생성
        MyInfo_01 my = new MyInfo_01();

        // 생성된 객체에 초기값 부여하는 방법 1
        my.name = "소유진";
        my.number = 20003324;
        my.dept = "소프트웨어학과";

        System.out.printf("이름 = %s\n", my.name);
        System.out.printf("학번 = %d\n", my.number);
        System.out.printf("학과 = %s", my.dept);
    }
}
