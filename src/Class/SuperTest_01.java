package Class;

public class SuperTest_01 {
    public static void main(String[] args) {
        // Parents 클래스로부터 parents 객체 생성
        Parents parents = new Parents();
        parents.parentInfo();
        System.out.println();

        // Parents 클래스로부터 상속 받아서 childs 객체 생성
        Childs childs = new Childs();
        childs.childInfo(); // 위의 parents 객체의 parent 정보까지 바뀌는건 아님
    }
}
