package Generic;

public class GenericsTest_02 {
    public static void main(String[] args) {
        // 정수형 복사인 경우
        Integer [] source = {100,200,300,400,500};
        Integer [] target = new Integer[source.length];

        copyArray(source,target);
        for(int element : target)
            System.out.printf("%d ",element);
        System.out.println();

        // 실수형 복사인 경우
        Double [] source1 = {10.1,20.1,30.1,40.1,50.1};
        Double [] target1 = new Double [source1.length];

        copyArray(source1,target1);
        for (double element : target1)
            System.out.printf("%3.1f ",element);
        System.out.println();

        // 문자 복사인 경우
        Character [] source2 = {'A','B','C','D','E'};
        Character [] target2 = new Character[source2.length];

        copyArray(source2,target2);
        for (Character element : target2)
            System.out.printf("%c ",element);
        System.out.println();

    }

    // 메소드로 전달되는 정수형, 실수형, 문자형 배열에 따라서 값이 복사되는 경우
    public static <T> void copyArray (T[] source, T[] target){
        for (int i = 0; i < source.length; i++) {
            target[i] = source[i];
        }
    }
}
