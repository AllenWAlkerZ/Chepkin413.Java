
import java.util.Scanner;


    public class lab6 {
        public static void main(String[] args) {
            int[] availableNotes = {100, 200, 500, 1000, 2000, 5000}; // доступные номиналы купюр
            int[] countOfEachNote = {10, 10, 10, 10, 10, 10}; // количество каждой купюры в банкомате
            int amount;

            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите сумму, которую необходимо снять: ");
            amount = scanner.nextInt();

            int[] countOfNotes = new int[availableNotes.length];

            for (int i = availableNotes.length - 1; i >= 0; i--) {
                if (amount >= availableNotes[i]) {
                    int notesNeeded = Math.min(amount / availableNotes[i], countOfEachNote[i]);
                    countOfNotes[i] = notesNeeded;
                    amount -= notesNeeded * availableNotes[i];
                }
            }

            if (amount > 0) {
                System.out.println("Запрошенную сумму невозможно выдать!");
            } else {
                System.out.println("Выданная сумма:");
                for (int i = availableNotes.length - 1; i >= 0; i--) {
                    if (countOfNotes[i] > 0) {
                        System.out.println(availableNotes[i] + " рублей: " + countOfNotes[i] + " купюр");
                    }
                }
            }
        }
    }

