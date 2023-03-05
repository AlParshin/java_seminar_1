// Реализовать простой калькулятор (+ - / *)

package java_projects.java_seminar_1;

import java.util.Scanner;

public class hometask3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        float n1 = scanner.nextInt();
        System.out.print("Введите знак + - / * : ");
        String s = scanner.next();
        System.out.print("Введите второе число: ");
        float n2 = scanner.nextInt();
        scanner.close();
        float res = 0;
        switch (s) {
            case "+":
                res = n1 + n2;
                break;
            case "-":
                res = n1 - n2;
                break;
            case "/":
                res = n1 / n2;
                break;
            case "*":
                res = n1 * n2;
                break;
        }
        System.out.print("Результат операции = " + res);
    }
}