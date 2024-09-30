package Class;

public class Childs extends Parents{
    String childName = "유진이";
    int childAge = 25;

    public void childInfo() {
        // 상위 클래스의 멤버변수에 값을 할당 시 super. 멤버변수 사용
        super.parentName = "우리엄마";
        super.parentAge = 52;

        // 상위 클래스의 patentInfo() 메소드를 사용 시 super.메소드이름() 사용하여 Overriding
        super.parentInfo();

        System.out.printf("나의 이름은 %s이고, 나이는 %d살 이다.\n",childName,childAge);
    }
}
