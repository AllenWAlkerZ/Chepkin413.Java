package lab5;

public class Lab5Zadacha4 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};

        int evenSum = 0; // Сумма четных элементов
        int oddSum = 0; // Сумма нечетных элементов

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenSum += arr[i];
            } else {
                oddSum += arr[i];
            }
        }

        System.out.println("Сумма четных элементов: " + evenSum);
        System.out.println("Сумма нечетных элементов: " + oddSum);
    }
}

