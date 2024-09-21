package start;

public class CompAssignTest_01 {
    public static void main(String[] args) {
        int x = 100;
        x += 10;
        System.out.println(x); // 110

        x = 100;
        x -= 10;
        System.out.println(x); // 90

        x = 100;
        x *= 10;
        System.out.println(x); // 1000

        x = 100;
        x /= 10;
        System.out.println(x); // 10

        x = 100;
        x %= 10;
        System.out.println(x); // 0
    }
}
