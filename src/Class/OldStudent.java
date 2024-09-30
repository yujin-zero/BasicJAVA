package Class;

public class OldStudent extends OldPerson{
    protected int number; // 학번
    protected String memClass; // 학과
    protected String subject; // 전공
    protected String grade; // 성적

    // 상속 받은 클래스 내의 displayPerson() 메소드를 오버라이딩(재정의)
    public void displayPerson() {
        System.out.printf("이름 : %s, 나이 : %d, 주소 : %s\n",name,age,address);
        System.out.printf("학번 : %d, 학과 : %s, 전공 : %s, 성적 : %s\n",number,memClass,subject,grade);
    }
}
