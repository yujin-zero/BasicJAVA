package OOP;

public class ToStringTest_01 {
    public static void main(String[] args) {
        // PersonInfo 형 객체생성 후 초기값을 생성자에게 전달
        PersonInfo prInfo = new PersonInfo("유진","서울","010-1212-3434");

        // toString() 메소드는 객체를 문자열로 표현한 값을 리턴한다.
        System.out.println(prInfo);

    }
}
