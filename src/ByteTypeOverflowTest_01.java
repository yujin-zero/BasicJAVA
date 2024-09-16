public class ByteTypeOverflowTest_01 {
    public static void main(String[] args) {
        byte byteType = 127;
        System.out.printf("byte 형 값 : %d\n", byteType);
        byteType = (byte) (byteType + 1);
        System.out.println("byte형 일 때 overflow 발생한 경우");
        System.out.printf("127 + 1 의 결과 : %d\n", byteType);

        byteType = 127;
        short shortType = (short) (byteType+1);
        System.out.println("byte 형을 short 형으로 형 변환한 경우");
        System.out.printf("127 + 1 의 결과 : %d\n", shortType);
    }
}
