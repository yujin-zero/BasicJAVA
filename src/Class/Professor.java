package Class;

public class Professor extends Person{
    private String major;

    public Professor(String name, String major, int age) {
        super(name,age);
        this.major = major;
    }

    // 상속받은 클래스로부터 printInfo() 메서드 오버라이딩
    public void printInfo() {
        System.out.println("<교수>");
        System.out.printf("이름 : %s\n",name);
        System.out.printf("나이 : %d\n",age);
        System.out.printf("전공 : %s\n",major);
    }
}
