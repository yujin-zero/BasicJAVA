package Generic;

public class EnumTypeTest_01 {
    enum Vehicles {bicycle, autoBicycle, car, bus, truck, airPlane, train};
    enum Weeks {Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday};

    public static void main(String[] args) {
        // 요일 순서 확인
        for (Weeks week : Weeks.values()) {
            System.out.printf("요일 = %s, 순서 = %d\n",week.name(),week.ordinal());
        }

        int vehiclesOrder = Vehicles.airPlane.ordinal();
        System.out.printf("열거형에서 airPlane의 순서 = %d\n",vehiclesOrder);

        // 타는 것들의 순서 확인
        for (Vehicles veh : Vehicles.values()) {
            System.out.printf("타는 것 = %s, 순서 = %d\n",veh.name(), veh.ordinal());
        }
    }
}
