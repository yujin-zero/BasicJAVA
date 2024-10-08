package Interfaces;

public abstract class SharpClass {
    protected int x,y,z;

    // 생성자 오버로딩
    public SharpClass() {}

    public SharpClass(int x){
        this.x = x;
    }

    public SharpClass(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public SharpClass(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public abstract void areaCalculate(); // 추상 메소드
}
