package Class;

public class Cow extends Animal{ // 하위클래스
    public Cow(String name, int age, String color) {
        super(name,age,color);
    }

    // bart() 메소드를 overriding
    public void bark() {
        System.out.println("음메~ 음메~");
    }
}
