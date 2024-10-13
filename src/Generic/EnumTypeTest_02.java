package Generic;

public class EnumTypeTest_02 {
    public static void main(String[] args) {
        Carkinds car1 = new Carkinds(Cars.Sonata);
        Carkinds car2 = new Carkinds(Cars.Genesis);

        for (Cars c : Cars.values()) {
            System.out.printf("%s : %d\n",c.name(),c.ordinal());
        }

        System.out.printf("%s 차종의 순서 : %d\n",car1.cars.name(),car1.cars.ordinal());
        System.out.printf("%s 차종의 순서 : %d\n",car2.cars.name(),car2.cars.ordinal());

        boolean b = (car1.cars == car2.cars); // 차종이 순서가 같은지 확인
        System.out.printf("%b",b);
    }
}
