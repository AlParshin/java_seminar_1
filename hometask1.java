// Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)

package java_projects.java_seminar_1;

import java.util.Scanner;

public class hometask1 {
    public static void main(String[] args) {
        System.out.print("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        int sum = 0;
        int fac = 1;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
            fac = fac * i;
        }
        System.out.println("Треугольная сумма = " + sum);
        System.out.println("Факториал = " + fac);
    }
}