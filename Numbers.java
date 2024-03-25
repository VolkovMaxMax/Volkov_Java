import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число:");
        int number1 = scanner.nextInt();

        System.out.println("Введите второе число:");
        int number2 = scanner.nextInt();

        System.out.printf("Результат сравнения чисел %d и %d:%n", number1, number2);

        if (number1 > number2) {
            System.out.printf("%d > %d%n", number1, number2);
        } else if (number1 < number2) {
            System.out.printf("%d < %d%n", number1, number2);
        } else {
            System.out.printf("%d = %d%n", number1, number2);
        }

        System.out.printf("%nСумма чисел %d и %d равна %d%n", number1, number2, number1 + number2);
        System.out.printf("Разность чисел %d и %d равна %d%n", number1, number2, number1 - number2);
        System.out.printf("Произведение чисел %d и %d равна %d%n", number1, number2, number1 * number2);

        if (number2 == 0) {
            System.out.println("Ошибка: На ноль делить нельзя!");
        } else {
            System.out.printf("Частное чисел %d и %d равна %d%n", number1, number2, number1 / number2);
        }
    }
}