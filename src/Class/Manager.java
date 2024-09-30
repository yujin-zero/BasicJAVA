package Class;

public class Manager extends Employee{
    public String address;

    // 슈퍼 클래스의 생성자 호출 시 super()를 사용하여 명시적으로 호출
    public Manager(String name, int age, String address) {
        // 부모 생성자 호출하여 이름과 나이를 부모 생성자에게 전달
        super(name,age);
        // 멤버변수에 값을 할당
        this.address = address;
    }

    public void managerInfo() {
        System.out.printf("감독 : 이름 = %s, 나이 = %d세, 주소 = %s\n",name,age,address);
    }
}
