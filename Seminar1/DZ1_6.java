package Seminar1;

import java.util.Scanner;

public class DZ1_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();
        System.out.print("Введите третье число: ");
        int c = scanner.nextInt();
        System.out.println(findMaxOfThree(a, b, c));
        scanner.close();
    }
    static int findMaxOfTwo(int a, int b) {/*ФУНКЦИЯ ОПРЕДЕЛЕНИЯ МАКСИМАЛЬНОГО ЧИСЛА */
        return (a > b) ? a : b;
        }
        
    static int findMaxOfThree(int a, int b, int c) {
        return findMaxOfTwo(findMaxOfTwo(a, b), c);
        }
}
