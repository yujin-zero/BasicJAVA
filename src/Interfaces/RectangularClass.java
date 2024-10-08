package Interfaces;

public class RectangularClass extends SharpClass{
    protected int length;
    protected int width;

    public RectangularClass(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // areaCalculate() 메소드 오버라이딩
    public void areaCalculate() {
        int area = length * width;
        System.out.printf("사각형의 면적 = %d\n",area);
    }
}
