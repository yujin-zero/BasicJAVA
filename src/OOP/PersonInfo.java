package OOP;

public class PersonInfo {
    String name;
    String address;
    String phoneNumber;

    // toString() 메소드 오버라이딩
    public String toString() {
        return String.format("이름 : %s, 주소 : %s, 핸드폰번호 : %s",name,address,phoneNumber);
    }

    // 생성자에서 자신의 생성자를 호출하는 경우
    public PersonInfo() {
        // 중복된 생성자 호출
        this("소유진", "하게동","010-2000-0330");
    }

    // 생성자
    public PersonInfo(String name, String address, String phoneNumber) {
        // 멤버변수와 매개변수의 이름이 동일한 경우 this 사용
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
}
