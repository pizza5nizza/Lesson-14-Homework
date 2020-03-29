import java.util.Scanner;

public class Exercise_3_Every_Second_Symbol {
    public static void main (String[] args) {
        System.out.println("Задача №3: Напишите программу, которая принимает на вход строку S и выводит каждый 2-й ее символ");

        // Создаём сканер для считывания ввода данных пользователя
        Scanner stringScanner = new Scanner(System.in);
        System.out.println("Введите строку:");

        // Приводим введённые в сканер данные к строчному значению, которое преобразуем в массив символов
        String enterString = stringScanner.nextLine();
        char[] charArray = enterString.toCharArray();

        // Создаём цикл, по которому перебираются чётные символы в массиве, и выводим их на печать
        System.out.println("Печатаю каждый второй символ строки:");
        for (int i = 1; i < enterString.length(); i = i + 2) {
            System.out.print(charArray[i]);
        }

        // Закрываем сканер, чтобы не оставлять мусор в памяти
        stringScanner.close();
    }
}
