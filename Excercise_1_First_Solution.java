public class Excercise_1_First_Solution {
    public static void main (String[] args) {
        // Первый способ, ламерский и немного читерский (но рабочий)
        System.out.println("Задача №1: вывести все числа от 1 до 100, которые делятся на 5");
        for (int i = 5; i <= 100; i = i + 5) {
            System.out.println(i);
        }
    }
}