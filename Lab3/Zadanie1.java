package Lab3;
import java.util.Scanner;
public class Zadanie1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.print("Введите значение n для теоремы Ферма (от 1 до 100): "); //ввод
        n = scanner.nextInt();

        if (n < 1 || n > 100) { //проверка условия ввода в диапазоне
            System.out.println("Ошибка: значение n должно быть от 1 до 100.");
        } else {
            for (int a = 1; a <= 100; a++) {
                for (int b = 1; b <= 100; b++) {
                    for (int c = 1; c <= 100; c++) {
                        boolean result = Math.pow(a, n) + Math.pow(b, n) == Math.pow(c, n); //формула
                        if (result && n >= 2) {
                            System.out.println("Решение найдено:");
                            System.out.println("a = " + a + ", b = " + b + ", c = " + c); //выводы
                            scanner.close();

                        }
                    }
                }
            }
            System.out.println("Нет решений для n > 2 и a, b, c от 1 до 100.");
        }
        scanner.close();
    }
}

