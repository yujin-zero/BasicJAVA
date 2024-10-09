package Interfaces;

public class InterfaceTest_02 {
    public static void main(String[] args) {
        Managable m1 = new Manager();
        Managable m2 = new Employee("소유진");
        Workable w1 = new Employee("소유진");
        Workable w2 = new Worker();

        m1.manage();
        m2.manage();
        w1.work();
        w2.work();
    }
}
