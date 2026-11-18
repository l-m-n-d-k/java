package app;

import generics.Circle;
import generics.SearchUtils;

public class TestSearch {
    public static void main(String[] args) {
        Integer[] numbers = {5, 8, 3, 9, 1};
        String[] words = {"java", "python", "c"};
        System.out.println("Позиция 9 в числах: " + SearchUtils.linearSearch(numbers, 9));
        System.out.println("Позиция 7 в числах: " + SearchUtils.linearSearch(numbers, 7));
        System.out.println("Позиция \"c\" в строках: " + SearchUtils.linearSearch(words, "c"));

        Circle[] circles = {new Circle(2.5), new Circle(7), new Circle(4.1)};
        System.out.println("Наибольший круг: " + SearchUtils.max(circles));
        System.out.println("Наибольшее число: " + SearchUtils.max(numbers));

        Integer[][] matrix = {{3, 7, 1}, {9, 2, 6}, {4, 8, 5}};
        System.out.println("Наибольшее в двумерном массиве: " + SearchUtils.max(matrix));
        Circle[][] circleMatrix = {{new Circle(1), new Circle(3)}, {new Circle(8), new Circle(2)}};
        System.out.println("Наибольший круг в двумерном массиве: " + SearchUtils.max(circleMatrix));
    }
}
