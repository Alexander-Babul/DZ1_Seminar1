package Seminar1;
/*1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n!
(произведение чисел от 1 до n)
 */

import java.util.Scanner;

public class DZ1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число треугольника: ");
        int a = scanner.nextInt();
        System.out.print("Введите число факториала: ");
        int b = scanner.nextInt();
        int number_triangl = digit_triangle(a);
        int faktorial = digit_factorial(b);
        System.out.println("Число треугольника " + number_triangl);
        System.out.println("Число факториала " + faktorial);
        scanner.close();
    }
    
    static int digit_triangle(int a){/*ФУНКЦИЯ ОПРЕДЕЛЕНИЯ ЧИСЛА ТРЕУГОЛЬНИКА */
        int result_digit_triangle = 0;
        int count = 1;
        while (count <= a) {
            result_digit_triangle += count;
            count++;
        }
        return result_digit_triangle;
    }

    static int digit_factorial(int a){/*ФУНКЦИЯ ОПРЕДЕЛЕНИЯ ФАКТОРИАЛА */
        if(a == 1 || a == 0) return 1;
        return a * digit_factorial(a - 1);
    }
}
