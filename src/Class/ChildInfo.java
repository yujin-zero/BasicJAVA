package Class;

public class ChildInfo {
    static int cnt; // 정적 멤버변수 선언
    String name;
    int age;
    String telNo;

    // 생성자
    ChildInfo(String name, int age, String telNo) {
        this.name = name;
        this.age = age;
        this.telNo = telNo;
        cnt++;
    }

    static int getCnt() {
        return cnt;
    }

    public String toString() {
        return String.format("이름 : %s, 나이 : %d, 전화번호 : %s\n",name,age,telNo);
    }
}
