package Class;

public class Person {
    protected String name;
    protected int age;

    // 생성자
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 멤버변수에 저장된 값 출력
    public void printInfo() {
        System.out.println("<개인>");
        System.out.printf("이름 : %s\n",name);
        System.out.printf("나이 : %d\n",age);
    }
}
