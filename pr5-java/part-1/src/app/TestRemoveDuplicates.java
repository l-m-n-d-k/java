package app;

import generics.ListUtils;
import java.util.ArrayList;
import java.util.Arrays;

public class TestRemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 1, 4, 3, 5));
        System.out.println("Числа до: " + numbers);
        System.out.println("Числа после: " + ListUtils.removeDuplicates(numbers));

        ArrayList<String> words = new ArrayList<>(Arrays.asList("java", "c", "java", "python", "c"));
        System.out.println("Строки до: " + words);
        System.out.println("Строки после: " + ListUtils.removeDuplicates(words));
    }
}
