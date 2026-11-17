package app;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MonthDays {
    private static final String[] months = {"январь", "февраль", "март", "апрель", "май",
            "июнь", "июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь"};
    private static final int[] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    private static int readInt(Scanner input, String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return input.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Нужно ввести целое число");
                input.next();
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = readInt(input, "Введите номер месяца (от 1 до 12): ");

        try {
            int days = dom[number - 1];
            if (number == 2) {
                int year = readInt(input, "Введите год: ");
                if (isLeapYear(year)) {
                    days = 29;
                }
            }
            System.out.println(months[number - 1] + ": " + days + " дн.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Недопустимое число");
        }
    }
}
