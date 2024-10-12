package JavaLang;

public class StringClassTest_03 {
    public static void main(String[] args) {
        int index = 0;
        String strD = "Korea is very beautiful country.";
        System.out.printf("strD = %s\n",strD);

        index = strD.indexOf('v');
        System.out.printf("문자열 내 문자 v가 위치한 곳 : %d\n",index);

        index = strD.indexOf("is");
        System.out.printf("문자열 내 문자열 is가 위치한 곳 : %d\n",index);

        index = strD.lastIndexOf('a');
        System.out.printf("문자열 내 문자 a가 위치한 곳 (뒤에서 부터) : %d\n",index);

        index = strD.lastIndexOf("beautiful");
        System.out.printf("문자열 내 문자열 beautiful이 위치한 곳 (뒤에서 부터) : %d\n",index);
    }
}
