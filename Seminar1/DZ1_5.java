package Seminar1;

import java.util.Scanner;

public class DZ1_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = scanner.nextInt();
        System.out.println(sum_numbers(a));
        scanner.close();
        
    }
    static int sum_numbers(int a){/*ФУНКЦИЯ ОПРЕДЕЛЕНИЯ СУММЫ ЦИФР ЧИСЛА */
        int sum = 0;
        while (a != 0) {
        sum += a % 10;
        a /= 10;
        }
        return sum;
    }
}
