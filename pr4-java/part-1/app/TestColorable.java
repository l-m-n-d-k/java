package app;

import shapes.Circle;
import shapes.Colorable;
import shapes.GeometricObject;
import shapes.IllegalTriangleException;
import shapes.Rectangle;
import shapes.Square;
import shapes.Triangle;

public class TestColorable {
    public static void main(String[] args) {
        GeometricObject[] objects = new GeometricObject[5];
        objects[0] = new Circle(2);
        objects[1] = new Rectangle(3, 4);
        try {
            objects[2] = new Triangle(3, 4, 5);
        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
            return;
        }
        objects[3] = new Square(5);
        objects[4] = new Square(2.5);

        for (GeometricObject object : objects) {
            System.out.println(object.getClass().getSimpleName() + ", площадь = " + object.getArea());
            if (object instanceof Colorable) {
                ((Colorable) object).howToColor();
            }
        }
    }
}
