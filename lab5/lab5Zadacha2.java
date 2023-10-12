package lab5;

public class lab5Zadacha2 {
    public static void main(String[] args) { //Задаём массив
        int[] B = {5, 2, 9, 1, 7, 3, 8, 4, 6};
        bubbleSort(B);

        for (int num : B) {             //задаём условие
            System.out.print(num + " ");
        }
    }

    public static void bubbleSort(int[] arr) { //задаём сортировку по возрастанию
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

