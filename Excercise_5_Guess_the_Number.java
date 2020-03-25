import java.util.Scanner;

/*
    Программа рабочая, но это не финальная версия:
1. Код генерации псевдослучайного числа я нагуглил и скопипастил, сам все его нюансы пока не разобрал.
В текущем варианте может сгенериться число 0. Хотелось бы доработать до 1, как указано в требованиях.
Возможно, попробую сделать версию с костылём: к диапазону от 0 до 99 будет на выходе тупо добавляться ещё +1.

2. Ещё пока не знаю, как без ошибок обработать ввод в сканер строчных значений.
Дробные числа тоже приводят к завершению программы с ошибкой.

3. Есть мысль написать версию с графическим интерфейсом. В имеющейся у меня книжке все примеры строятся
на старой библиотеке Swing - она не очень красивая, но попробовать можно (в отдельном бранче).
*/

public class Excercise_5_Guess_the_Number {
    public static void main (String[] args) {
        final int maxNumber = 100; // Максимальное число для диапазона от 0 до maxNumber
        final int randomNumber = randomNumber(maxNumber);

        // Не баг, но опциональная фича:
        // По умолчанию в консоль выводится загаданное программой число, чтобы было проще тестировать.
        // Если закомментировать соответствующую строку, угадывать число придётся вслепую, как и задумано.
        System.out.println("Псевдослучайное целое число от 1 до 100: " + randomNumber);

        Scanner numberScanner = new Scanner(System.in);
        System.out.println("Угадайте целое число от 1 до 100 включительно! Введите Ваш вариант:");
        int enterNumber = numberScanner.nextInt();

        while (enterNumber != randomNumber) {

            if (enterNumber < 1 || enterNumber > 100) {
                System.out.println("Число должно быть от 1 до 100 включительно! Пробуйте ещё...");
                System.out.println("Угадайте число от 1 до 100 включительно! Введите Ваш вариант:");
                enterNumber = numberScanner.nextInt();
            }

            else if (enterNumber > randomNumber) {
                System.out.println("Слишком много! Пробуйте ещё...");
                System.out.println("Угадайте число от 1 до 100 включительно! Введите Ваш вариант:");
                enterNumber = numberScanner.nextInt();
            }

            else if (enterNumber < randomNumber) {
                System.out.println("Слишком мало! Пробуйте ещё...");
                System.out.println("Угадайте число от 1 до 100 включительно! Введите Ваш вариант:");
                enterNumber = numberScanner.nextInt();
            }

        }

        if (enterNumber == randomNumber) {
            System.out.println("Поздравляем, Вы угадали! Действительно, было загадано число " + randomNumber);
        }

        numberScanner.close();
    }

    private static int randomNumber(int maxNumber) {
        return (int) (Math.random() * ++maxNumber);
    }
}
