package Class;

public class Student extends Person{
    private String majorClass, grade;

    // 생성자
    public Student(String name, String majorClass, String grade, int age){
        super(name,age);
        this.majorClass = majorClass;
        this.grade = grade;
    }

    // printInfo 메서드를 오버라이딩
    public void printInfo() {
        System.out.println("<학생>");
        System.out.printf("이름 : %s\n",name);
        System.out.printf("나이 : %d\n",age);
        System.out.printf("학과 : %s\n",majorClass);
        System.out.printf("학년 : %s\n",grade);
    }
}
