package OOP;

public class ThisConstructTest_01 {
    public static void main(String[] args) {
        PersonInfo pr1 = new PersonInfo();
        System.out.println(pr1);
        PersonInfo pr2 = new PersonInfo("성하","성하방","010-1212-1212");
        System.out.println(pr2);
    }
}
