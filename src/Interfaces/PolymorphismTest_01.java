package Interfaces;

public class PolymorphismTest_01 {
    public static void main(String[] args) {
        CircleClass circle = new CircleClass(5);
        circle.areaCalculate();

        RectangularClass rectangular = new RectangularClass(15,20);
        rectangular.areaCalculate();

        TraperziodClass trapezoid = new TraperziodClass(15,20,5);
        trapezoid.areaCalculate();
    }
}
