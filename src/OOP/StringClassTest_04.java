package OOP;

public class StringClassTest_04 {
    public static void main(String[] args) {
        // 문자열 배열 선언
        String strA[] = new String[4];

        // 문자열 배열에서 객체생성 후 초기값을 default 생성자에게 전달
        strA[0] = new String("김태연");

        // 문자열 배열은 객체이므로 객체를 생성하지 않고 문자열 저장
        strA[1] = "권유리";
        strA[2] = "이순규";
        strA[3] = "황미영";

        // 문자열에 저장된 값을 for 문을 이요하여 출력
        for (String stA : strA)
            System.out.printf("  %s",stA);
        System.out.println();

        // 문자열 배열 선언 및 초기값 부여2
        String strB [] = {
                "최수영", "임윤아", "서주현", "김효연"
        };

        for (String stB : strB)
            System.out.printf("  %s",stB);

    }
}
