package Interfaces;

public class CircleClass extends SharpClass{
    protected int radius;

    public CircleClass(int radius) {
        this.radius = radius;
    }

    // areaCalculate() 메소드 오버라이딩
    public void areaCalculate() {
        double area = 3.141592 * radius * radius;
        System.out.printf("원의 면적 = %f\n",area);
    }
}
