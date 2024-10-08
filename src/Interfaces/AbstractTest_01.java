package Interfaces;

public class AbstractTest_01 {
    public static void main(String[] args) {
        AutoMobile auto = new AutoMobile();
        auto.start();
        System.out.println();

        auto.stop();
        System.out.println();

        // VehicleClass vc = new VehicleClass();
        // 추상 클래스향의 객체를 생성 못함

        VehicleClass vc;
        vc = (VehicleClass) auto; // auto 객체를 VehicleClass 형으로 형변환하여 vc에 저장
        auto.start();
        System.out.println();
        System.out.printf("자동차 바퀴 개수 : %d, 엔진상태 : %b\n",vc.wheelNumber,vc.engineState);
    }
}
