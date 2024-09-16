import java.util.Scanner;
public class BoolTypeTest_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean boolA, boolB;
        int x,y;
        System.out.printf("x : ");
        x = sc.nextInt();
        System.out.printf("y : ");
        y = sc.nextInt();
        System.out.println();

        boolA = x > y;
        System.out.printf("%d > %d = %b\n",x,y,boolA);
        boolB = x < y;
        System.out.printf("%d < %d = %b\n",x,y,boolB);
    }
}
