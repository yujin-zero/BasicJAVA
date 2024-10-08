package Class;

public class Animal { // 상위클래스
    protected String name;
    protected int age;
    protected String color;

    public Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public void bark() {
        System.out.println("하하하~");
    }

    public String toString(){
        return String.format("이름 : %s, 나이 : %d, 색 : %s",name,age,color);
    }
}
