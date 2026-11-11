package app;

import shapes.ComparableCircle;
import shapes.GeometricObject;
import shapes.Rectangle;

public class TestComparableCircle {
    public static void main(String[] args) {
        ComparableCircle circle1 = new ComparableCircle(3);
        ComparableCircle circle2 = new ComparableCircle(5);
        Rectangle rectangle = new Rectangle(10, 8);

        ComparableCircle biggerCircle = circle1.compareTo(circle2) >= 0 ? circle1 : circle2;
        System.out.println("Наибольший из двух кругов: радиус = " + biggerCircle.getRadius()
                + ", площадь = " + biggerCircle.getArea());

        GeometricObject biggerOfBoth = biggerCircle.compareTo(rectangle) >= 0 ? biggerCircle : rectangle;
        System.out.println("Круг (площадь " + biggerCircle.getArea() + ") и прямоугольник (площадь "
                + rectangle.getArea() + "): больше " + (biggerOfBoth == biggerCircle ? "круг" : "прямоугольник"));
    }
}
