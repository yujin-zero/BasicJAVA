package Class;

public class InheritanceTest_01 {
    public static void main(String[] args) {
        // Adams 클래스로부터 adams 객체를 생성
        Adams adams = new Adams();
        System.out.println(adams.adam);
        System.out.println();

        // Mams 클래스는 Adams 클래스를 상속받아서 mams 객체를 생성
        Mams mams = new Mams();
        System.out.println(mams.adam);
        System.out.println(mams.mam);
        System.out.println();

        // Dogs 클래스는 Mams 클래스를 상속받아서 dogs 객체를 생성
        Dogs dogs = new Dogs();
        System.out.println(dogs.adam);
        System.out.println(dogs.mam);
        System.out.println(dogs.dog);
        System.out.println();

        // Cows 클래스는 Mams 클래스를 상속받아서 cows 객체를 생성
        Cows cows = new Cows();
        System.out.println(cows.adam);
        System.out.println(cows.mam);
        System.out.println(cows.cow);
        System.out.println();

        // Horses 클래스는 Mams 클래스를 상속받아서 horses 객체를 생성
        Horses horses = new Horses();
        System.out.println(horses.adam);
        System.out.println(horses.mam);
        System.out.println(horses.horse);
    }
}
