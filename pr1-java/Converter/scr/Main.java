import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final double ROUBLES_PER_YUAN = 11.91;

        int yuan;

        double roubles;

        int digit;
        int lastTwoDigits;
        String yuanWord;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сумму в китайских юанях: ");
        yuan = scanner.nextInt();

        roubles = ROUBLES_PER_YUAN * yuan;

        digit = yuan % 10;
        lastTwoDigits = yuan % 100;

        if (lastTwoDigits >= 11 && lastTwoDigits <= 14) {
            yuanWord = "китайских юаней";
        } else if (digit == 1) {
            yuanWord = "китайский юань";
        } else if (digit >= 2 && digit <= 4) {
            yuanWord = "китайских юаня";
        } else {
            yuanWord = "китайских юаней";
        }

        System.out.println(yuan + " " + yuanWord + " = " + roubles + " рублей");

        scanner.close();
    }
}
