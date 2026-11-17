package shapes;

public class IllegalTriangleException extends Exception {
    public IllegalTriangleException(double side1, double side2, double side3) {
        super("Недопустимые стороны треугольника: " + side1 + ", " + side2 + ", " + side3
                + " (сумма любых двух сторон должна быть больше третьей)");
    }
}
