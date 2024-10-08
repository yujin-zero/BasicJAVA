package Class;

public class Horse extends Animal{
    public Horse(String name, int age, String color){
        super(name,age,color);
    }

    // bark() 메소드를 overriding
    public void bark(){
        System.out.println("히힝~ 히힝~");
    }
}
