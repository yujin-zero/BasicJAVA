package OOP;

// this와 this() 메소드
class Shape {
    int width;
    int height;
    String color;

    // 생성자
    // this : 멤버변수와 생성자의 매개변수를 구분하기 위해 사용
    Shape(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // 메소드
    void setColor(String color) {
        this.color = color;
    }

}
