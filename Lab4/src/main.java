package lab4;
import static java.lang.Math.random;
public class main {
    public static void main(String[] args){
        String[] MyArray = new String[10]; //создаём массив
        MyArray[0] = "ноль"; //сохраняем в массив буквенное название числа
        MyArray[1] = "один";
        MyArray[2] = "два";
        MyArray[3] = "три";
        MyArray[4] = "четыре";
        MyArray[5] = "пять";
        MyArray[6] = "шесть";
        MyArray[7] = "семь";
        MyArray[8] = "восемь";
        MyArray[9] = "девять";
        int n = (int) (random()*10); //генерируем рандомное число от 0 до 1 и умножаем на 10 и перевод в целочисл
            System.out.println(n);
            System.out.println(MyArray[n]);



        }

    }

