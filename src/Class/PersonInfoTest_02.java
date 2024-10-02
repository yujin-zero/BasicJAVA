package Class;

public class PersonInfoTest_02 {
    public static void main(String[] args) {
        // 생성자를 통해서 초기값을 전달
        PersonInfo_01 pi = new PersonInfo_01("소유진","010-3333-4444",25);

        String telNo = pi.getTelNo();
        int age = pi.getAge();
        System.out.println(pi.getName() + " : " + telNo + " : " + age);

        // 부모 클래스 내의 멤버변수가 protected 인 경우는 직접 접근하여 값을 저장 가능
        pi.name = "안성재";
        pi.telNo = "010-1234-5678";
        pi.age = 33;
        // 멤버변수에 저장된 값을 직접 접근하여 출력
        System.out.println(pi.name + " : " + pi.telNo + " : " + pi.age);

        // 부모 클래스 내의 멤버변수가 protected 이므로 메소드를 통해서도 접근하여 값을 저장 가능
        pi.setName("조은주");
        pi.setTelNo("010-1212-3434");
        pi.setAge(44);
        System.out.println(pi.getName() + " : " + pi.getTelNo() + " : " + pi.getAge());
    }
}
