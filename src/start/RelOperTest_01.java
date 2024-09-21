package start;

public class RelOperTest_01 {
    public static void main(String[] args) {
        int x = 100, y = 200;

        System.out.printf("%d > %d = %b\n",x,y,(x>y)); // false
        System.out.printf("%d >= %d = %b\n",x,y,(x>=y)); // false
        System.out.printf("%d < %d = %b\n",x,y,(x<y)); // true
        System.out.printf("%d <= %d = %b\n",x,y,(x<=y)); // true
        System.out.printf("%d == %d = %b\n",x,y,(x==y)); // false
        System.out.printf("%d != %d = %b\n",x,y,(x!=y)); // true
    }
}
