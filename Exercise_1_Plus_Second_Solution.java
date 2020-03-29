public class Exercise_1_Plus_Second_Solution {
    public static void main (String[] args) {
        // Второй способ, профессиональный
        System.out.println("Задача №1*: вывести все числа от 1 до 100, которые делятся на 3, но не делятся на 6");
        int i;
        for(i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 6 != 0) {
                System.out.println(i);
            }
        }
    }
}
