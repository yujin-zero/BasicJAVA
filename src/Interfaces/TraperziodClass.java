package Interfaces;

public class TraperziodClass extends SharpClass{
    protected int topside;
    protected int bottomside;
    protected int height;

    public TraperziodClass(int topside, int bottomside, int height){
        this.topside = topside;
        this.bottomside = bottomside;
        this.height = height;
    }

    // areaCalculate() 메소드를 오버라이딩
    public void areaCalculate() {
        int area = ((topside + bottomside) * height) / 2;
        System.out.printf("사다리꼴의 면적 = %d\n",area);
    }
}
