package OOP;

public class StringClassTest_03 {
    public static void main(String[] args) {
        // 문자열에서 + 연산자는 문자열을 연결
        String strA = "안녕하세요. ";
        strA += "저는 ";
        strA += "소유진";
        strA += "입니다.";
        System.out.printf("문자열 연결의 경우 : %s\n",strA);

        // 문자열과 숫자를 연결 시 숫자는 문자열로 변환되어 연결된다.
        String strB;
        strB = "당신의 자바 점수는 " + 100 + "점 입니다.";
        System.out.printf("문자열과 숫자 연결의 경우 : %s\n",strB);

        double avg = 89.90;
        System.out.printf("평균은 " + avg + "점 입니다.");
    }
}
