package OOP;

class MyInfo_04 {
    public String name;
    public int age;
    public String dept;
    public int degree;

    // 생성자 중복
    public MyInfo_04() {
        name = "윤아";
        age = 35;
        dept = "소녀시대";
        degree = 3;
    }

    public MyInfo_04(int age, String dept, int degree) {
        this.name = "유리";
        this.age = age;
        this.dept = dept;
        this.degree = degree;
    }

    public MyInfo_04(String name, int age, String dept, int degree) {
        this.name = name;
        this.age = age;
        this.dept = dept;
        this.degree = degree;
    }

    // 결과 출력
    public void infoDisplay(){
        System.out.printf("이름 = %s, 나이 = %d, 학과 = %s, 학년 = %d\n",name,age,dept,degree);
    }
}

public class ConstOverLoadingTest_01 {
    public static void main(String[] args) {
        // 생성자만 호출하는경우
        MyInfo_04 myInfo = new MyInfo_04();
        myInfo.infoDisplay();

        // 생성자를 호출하면서 인수 3개 넘기기
        MyInfo_04 myInfo3 = new MyInfo_04(25,"안녕",4);
        myInfo3.infoDisplay();

        // 4개 넘기기
        MyInfo_04 myInfo4 = new MyInfo_04("효연", 36, "댄스",4);
        myInfo4.infoDisplay();
    }
}
