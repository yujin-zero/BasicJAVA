package Class;

public class ClassTypeCastingTest_01 {
    public static void main(String[] args) {
        Cow cow = new Cow("누렁이",2,"노란색");
        System.out.print("Cow : "+cow.toString()+", ");
        cow.bark();

        Horse horse = new Horse("적토마",3,"검정색");
        System.out.print("Horse : " + horse.toString() + ", ");
        horse.bark();

        Animal animal = new Animal("",0,"");
        System.out.print("Animal : " + animal.toString() + ", ");
        animal.bark();

        animal = cow; // Cow 클래스를 Animal 클래스에 치환
        System.out.print("Animal : " + animal.toString() + ", ");
        animal.bark();

        animal = horse; // Horse 클래스를 Animal 클래스에 치환
        System.out.print("Animal : " + animal.toString() + ", ");
        animal.bark();

        horse = (Horse)animal; // Animal 클래스를 Horse 클래스로 형 변환
        System.out.print("Horse : " + horse.toString() + ", ");
        horse.bark();
    }
}
