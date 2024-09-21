package ControlStatements;

public class ForEachTest_01 {
    public static void main(String[] args) {
        int intArray [] = {67, 48, 94, 99, 83, 68, 85, 82, 94, 88};
        int sum = 0;
        int arrayLength;
        double aver;
        arrayLength = intArray.length;

        for (int n : intArray) {
            sum += n;
        }
        aver = (double)sum / arrayLength;

        System.out.printf("배열의 합 = %d\n",sum);
        System.out.printf("배열의 크기 = %d\n",arrayLength);
        System.out.printf("배열이 평균 : %d / %d = %3.2f",sum,arrayLength,aver);
    }
}
