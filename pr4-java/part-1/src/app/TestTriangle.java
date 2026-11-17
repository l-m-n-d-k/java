package app;

import java.util.Locale;
import java.util.Scanner;

import shapes.IllegalTriangleException;
import shapes.Triangle;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.print("Введите три стороны треугольника: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();
        System.out.print("Введите цвет: ");
        String color = input.next();
        System.out.print("Закрашен ли треугольник (true/false): ");
        boolean filled = input.nextBoolean();

        try {
            Triangle triangle = new Triangle(side1, side2, side3);
            triangle.setColor(color);
            triangle.setFilled(filled);

            System.out.println(triangle);
            System.out.println("Площадь: " + triangle.getArea());
            System.out.println("Периметр: " + triangle.getPerimeter());
            System.out.println("Цвет: " + triangle.getColor());
            System.out.println("Закрашен: " + triangle.isFilled());
        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
        }
    }
}
