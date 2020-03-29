public class Exercise_1_Plus_First_Solution {
    public static void main (String[] args) {
        // Первый способ, ламерский и немного читерский (но рабочий)
        System.out.println("Задача №1*: вывести все числа от 1 до 100, которые делятся на 3, но не делятся на 6");
        for(int i = 3; i <= 100; i = i + 6) {
            System.out.println(i);
        }
    }
}
