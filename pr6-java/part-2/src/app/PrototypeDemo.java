package app;

import prototype.Circle;
import prototype.Rectangle;
import prototype.Shape;

public class PrototypeDemo {
    public static void main(String[] args) {
        Circle circle = new Circle(4.0);
        Rectangle rectangle = new Rectangle(3.0, 6.0);

        Circle circleCopy = (Circle) circle.clone();
        Rectangle rectangleCopy = (Rectangle) rectangle.clone();

        circleCopy.setRadius(10.0);
        rectangleCopy.setWidth(7.5);
        rectangleCopy.setHeight(1.5);

        System.out.println("Оригиналы:");
        System.out.println("  " + circle);
        System.out.println("  " + rectangle);
        System.out.println("Копии после изменения:");
        System.out.println("  " + circleCopy);
        System.out.println("  " + rectangleCopy);

        Shape other = rectangle.clone();
        System.out.println("Копия - другой объект: " + (other != rectangle));
    }
}
