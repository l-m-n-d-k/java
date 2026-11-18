package app;

import generics.GenericStackInherited;
import java.util.Scanner;

public class TestGenericStackInherited {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GenericStackInherited<String> stack = new GenericStackInherited<>();
        System.out.println("Введите пять строк:");
        for (int i = 0; i < 5; i++) {
            stack.push(input.nextLine());
        }
        System.out.println(stack);
        System.out.println("В обратном порядке:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
