package app;

import shapes.Circle;
import shapes.GeometricObject;
import shapes.Rectangle;

public class TestMax {
    public static void main(String[] args) {
        Circle circle1 = new Circle(3);
        Circle circle2 = new Circle(5);
        Rectangle rectangle1 = new Rectangle(4, 6);
        Rectangle rectangle2 = new Rectangle(2, 3);

        GeometricObject biggerCircle = GeometricObject.max(circle1, circle2);
        GeometricObject biggerRectangle = GeometricObject.max(rectangle1, rectangle2);

        System.out.println("Наибольший круг: радиус = " + ((Circle) biggerCircle).getRadius()
                + ", площадь = " + biggerCircle.getArea());
        System.out.println("Наибольший прямоугольник: " + ((Rectangle) biggerRectangle).getWidth() + " x "
                + ((Rectangle) biggerRectangle).getHeight() + ", площадь = " + biggerRectangle.getArea());
    }
}
