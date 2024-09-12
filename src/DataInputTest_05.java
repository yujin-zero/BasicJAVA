import java.util.Scanner;
public class DataInputTest_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("불린 값(ture/false) 입력 : ");
        boolean b = sc.nextBoolean();
        System.out.printf("입력된 불린 값은 \"%b\"이다.",b);
    }
}
