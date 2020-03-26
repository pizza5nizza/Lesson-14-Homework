import java.util.Scanner;

public class Excercise_4_Reversed_String {
    public static void main (String[] args) {
        System.out.println("Задача №4: Напишите программу, которая принимает на вход строку S, и выводит ее “задом наперед”");

        // Создаём сканер для считывания ввода данных пользователя, приводим к строчному значению
        Scanner stringScanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String enterString = stringScanner.nextLine();

        // Создаём конструктор/буфер строк и методом reverse меняем порядок его символов на обратный
        // Здесь можно было бы использовать аналогичный класс StringBuffer
        StringBuilder builder = new StringBuilder(enterString);
        builder.reverse();

        System.out.println("Строка наоборот:\n" + builder);

        // Закрываем сканер, чтобы не оставлять мусор в памяти
        stringScanner.close();
    }
}
