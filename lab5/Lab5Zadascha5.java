package lab5;
import java.util.Random;
public class Lab5Zadascha5 {
    public static void main(String[] args) {
        int[][] table = new int[3][5];

        Random random = new Random();

// Заполнение таблицы случайными числами
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = random.nextInt(10); // Генерация случайного числа от 0 до 9
            }
        }

// Вывод таблицы на консоль
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }
}

