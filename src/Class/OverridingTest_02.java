package Class;

public class OverridingTest_02 {
    public static void main(String[] args) {
        Person person = new Person("유진",25);
        Professor professor = new Professor("교수님","가르치기 싫어학과",55);
        Student student = new Student("학생님","공부하기 싫어학과","3학년",22);

        person.printInfo();
        professor.printInfo();
        student.printInfo();
    }
}
