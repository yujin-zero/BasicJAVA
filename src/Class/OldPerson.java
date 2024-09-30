package Class;

public class OldPerson {
    protected String name;
    protected int age;
    protected String address;

    // 멤버변수에 저장된 값을 출력
    public void displayPerson() {
        System.out.printf("이름 : %s, 나이 : %d, 주소 : %s\n",name,age,address);
    }
}
