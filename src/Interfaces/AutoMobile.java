package Interfaces;

public class AutoMobile extends VehicleClass{
    // 추상메서드 구현
    public void start() {
        super.carInfo();
        System.out.println("자동차가 출발");
        engineState = true;
    }

    public void stop() {
        super.carInfo();
        System.out.println("자동차가 정지");
        engineState = false;
    }
}
