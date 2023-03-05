// Вывести все простые числа от 1 до 1000

package java_projects.java_seminar_1;

public class hometask2 {
    public static void main(String[] args) {
        System.out.print(2 + " ");
        for (int i = 3; i <= 1000; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0)
                    break;
                else if (j == i - 1)
                    System.out.print(i + " ");
            }
        }
    }
}