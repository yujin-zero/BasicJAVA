package Class;

public class OverridingTest_01 {
    public static void main(String[] args) {
        OldPerson person = new OldPerson();
        person.name = "아빠";
        person.age = 57;
        person.address = "하계동";
        person.displayPerson();
        System.out.println();

        // OldStudent 클래스는 Oldperson 클래스로 부터 상속받아서 student 생성
        OldStudent student = new OldStudent();
        student.name = "아들";
        student.age = 23;
        student.address = "방";
        student.number = 20003324;
        student.memClass = "소프트웨어학과";
        student.subject = "파이썬";
        student.grade = "A+";
        student.displayPerson();
    }
}
