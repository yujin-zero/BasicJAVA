package OOP;

class MyInfo_02 {
    public String name;
    public int number;
    public String dept;

    // 생성자 정의
    public MyInfo_02(String s, int i, String d) {
        name = s;
        number = i;
        dept = d;
    }
}

public class ConstructorTest_02 {
    public static void main(String[] args) { // 메인 메서드
        // MyInfo_02 클래스형인 객체를 생성하면서 값을 같이 전달
        MyInfo_02 my = new MyInfo_02("소유진",20003324,"소프트웨어학과");

        System.out.printf("이름 = %s\n",my.name);
        System.out.printf("학번 = %d\n",my.number);
        System.out.printf("학과 = %s",my.dept);
    }
}
