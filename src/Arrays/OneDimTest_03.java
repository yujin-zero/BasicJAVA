package Arrays;

public class OneDimTest_03 {
    public static void main(String[] args) {
        double dblArr[] = {100.01, 200.02, 300.03, 400.04, 500.05};

        System.out.printf("배열의 크기 = %d\n",dblArr.length);
        for (int i=0; i < dblArr.length; i++) {
            System.out.printf("intArr [%d] = %.2f\n",i,dblArr[i]);
        }
    }
}
