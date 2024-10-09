package Interfaces;
import java.util.Scanner;

public class InterfaceTest_01 {
    static String answer;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 인터페이스 테스트
        do{
            System.out.print("동물 선택 고양이(0), 강아지(1), 소(2) : ");
            int kind = sc.nextInt();
            IAnimal ia = getBikeKind(kind);
            System.out.println(ia.bike()); // 선택된 동물의 울음소리
            System.out.print("\n계속하시겠습니까? (Y/N) ");
            answer = sc.next();
        } while(answer.equalsIgnoreCase("Y"));
    }

    // 인터페이스 형의 메소드 구현
    public static IAnimal getBikeKind(int kind) {
        IAnimal ia = null;
        switch (kind) {
            case 0 :
                ia = new Cat();
                break;
            case 1 :
                ia = new Dog();
                break;
            case 2:
                ia = new Cow();
                break;
        }

        return ia;
    }
}
