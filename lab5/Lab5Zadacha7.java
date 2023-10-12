package lab5;
import java.util.Arrays;
public class Lab5Zadacha7 {
    public static void main(String[] args) { //объявяем массивы
        int[] s1 = {1, 2, 3};
        int[] s2 = {4, 5, 6};
        int[] s3 = {7, 8, 9};
        int[] s4 = {7, 8, 9};
        int[] s5 = {7, 8, 9};

        int[] result;
        if (Arrays.equals(s4, s5)) { //с помощью arrays equals сравниваем их
            result = new int[s1.length + s2.length]; //в первом случае складываем длины s1 и s2
            System.arraycopy(s1, 0, result, 0, s1.length); //далее копируем результат
            System.arraycopy(s2, 0, result, s1.length, s2.length);
        } else {
            result = new int[s1.length + s3.length]; //второй случай тоже самое, просто другое условие
            System.arraycopy(s1,0, result, 0, s1.length);
            System.arraycopy(s3, 0, result, s1.length, s3.length);
        }

        System.out.println("Результат: " + Arrays.toString(result)); //выдача результата
    }
}






