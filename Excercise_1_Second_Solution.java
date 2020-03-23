public class Excercise_1_Second_Solution {
    public static void main (String[] args) {
        // Второй способ, профессиональный
        System.out.println("Задача №1: вывести все числа от 1 до 100, которые делятся на 5");
        int i;
        for(i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}
