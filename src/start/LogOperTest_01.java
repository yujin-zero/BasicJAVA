package start;

public class LogOperTest_01 {
    public static void main(String[] args) {
        int x = 30, y = 100, z = 10;
        boolean resultA, resultB, resultC;

        resultA = (x>y) && (y>z);
        resultB = (x>y) || (y>z);
        resultC = !(x>y) && (y>z);

        System.out.printf("(%d > %d) && (%d > %d) = %b\n",x,y,y,z,resultA);
        System.out.printf("(%d > %d) || (%d > %d) = %b\n",x,y,y,z,resultB);
        System.out.printf("!(%d > %d) && (%d > %d) = %b\n",x,y,y,z,resultC);
    }
}
