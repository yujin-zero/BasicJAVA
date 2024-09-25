package OOP;

class HandPhone {
    // 멤버 변수 선언
    String phoneNumber;
    String name;
    String address;

    // 메소드 작성
    public void hangUp() {
        // 전화를 거는 메소드
        System.out.printf("%s에게 %s 번호로 전화를 건다.\n",name, phoneNumber);
    }

    public void receive() {
        // 전화를 받는 메소드
        System.out.printf("%s가 %s 번호로 전화를 받는다.\n",name, phoneNumber);
    }

    public void ownerInfo() {
        // 소유자 정보 출력
        System.out.printf("이름 : %s\n",name);
        System.out.printf("주소 : %s\n",address);
        System.out.printf("번호 : %s\n",phoneNumber);
    }
}

public class HandPhoneMainTest{
    public static void main(String[] args) {
        // HandPhone 클래스로부터 객체 생성(instance)
        HandPhone samsungHpc = new HandPhone();
        HandPhone lgHpc = new HandPhone();
        HandPhone motoHpc = new HandPhone();

        // samsungHpc 객체에 초기값 부여
        samsungHpc.name = "소유진";
        samsungHpc.address = "서울시 노원구";
        samsungHpc.phoneNumber = "010-1234-5678";

        // samsungHpc 객체에 저장된 결과 출력
        samsungHpc.ownerInfo();
        System.out.println();

        // lgHpc 객체에 초기값 부여
        lgHpc.name = "단지";
        lgHpc.address = "내 방";
        lgHpc.phoneNumber = "010-1234-0000";

        // lgHpc 객체에 저장된 결과 출력
        lgHpc.ownerInfo();
        System.out.println();

        // motoHpc 객체에 초기값 부여
        motoHpc.name = "태연";
        motoHpc.address = "내 맘속";
        motoHpc.phoneNumber = "010-0309-0000";

        motoHpc.ownerInfo();
        System.out.println();

        // 전화를 걸거나 받는 메소드 호출
        samsungHpc.hangUp();
        lgHpc.receive();
    }
}


