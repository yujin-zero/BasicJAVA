package Class;

public class PersonInfoTest_01 {
    public static void main(String[] args) {
        // 생성자를 통해서 초기값을 전달
        PersonInfo pi = new PersonInfo("소유진","010-3333-0000",25);
        String telNo = pi.getTelNo();
        int age = pi.getAge();
        System.out.println(pi.getName() + " : " + telNo + " : " + age);

        // 부모 클래스내의 private 멤버변수는 자식 클래스에서 직접 접근 불가
//         pi.name = "백종원";
//         pi.age = 33; //이렇게 접근 불가

        // 부모 클래스내의 멤버변수가 private인 경우는 자식 클래스에서 메소드를 통해서 접근 가능
        // setXX() 메소드를 통해거 write
        pi.setName("백종원");
        pi.setTelNo("010-1111-2222");
        pi.setAge(45);

        // getXX() 메소드를 통해서 멤버변수에 저장된 값을 읽어옴(read)
        String name = pi.getName();
        telNo = pi.getTelNo();
        age = pi.getAge();
        System.out.println(name + " : " + telNo + " : " + age);
    }
}
