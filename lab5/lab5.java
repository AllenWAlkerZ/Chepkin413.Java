package lab5;

import java.util.Scanner;

public class lab5 {
    public static void main(String[] args) {

        int[] A = {5, 10, 2, 8, 3, 15, 1, 7, 9, 6, 12, 4, 11, 25, 18, 20, 16, 22, 19, 14, 23, 21, 24, 17, 13};
        System.out.println("старый массив:");
        for (int num : A) {
            System.out.print(num + " ");
        }
        // Находим минимальный и максимальный элементы массива
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 1; i < A.length; i++) {
            if (A[i] < A[minIndex]) {
                minIndex = i;
            }
            if (A[i] > A[maxIndex]) {
                maxIndex = i;
            }
        }
        // Меняем местами минимальный и максимальный элементы
        int temp = A[minIndex];
        A[minIndex] = A[maxIndex];
        A[maxIndex] = temp;
        // Выводим измененный массив
        System.out.println("Измененный массив:");
        for (int num : A) {
            System.out.print(num + " ");
        }
    }
}

