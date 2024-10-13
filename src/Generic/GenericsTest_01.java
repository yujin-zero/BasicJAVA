package Generic;

public class GenericsTest_01 {
    public static void main(String[] args) {
        // 정수형, 실수형, 문자열 배열 선언
        Integer[] intArray = {10,20,30,40,50};
        Double[] dblArray = {12.1,22.2,32.3,42.4,52.5,62.6};
        String[] strArray = {"환","영","합","니","다","."};

        prtArray(intArray);
        prtArray(dblArray);
        prtArray(strArray);
    }

    // 메소드로 전달되는 정수형, 실수형, 문자열형 배열에 따라서 결과를 출력하는 경우
    public static <T> void prtArray(T[] trsArray) {
        // 배열 요소들 출력
        for (T s : trsArray)
            System.out.printf("%s ",s);
        System.out.println();
    }
}
