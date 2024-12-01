package Seminar1;

import java.util.Scanner;
/*2. Вывести все простые числа от 1 до 1000 */
public class DZ1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите начало простых чисел: ");
        int a = scanner.nextInt();
        System.out.print("Введите конец простых чисел: ");
        int b = scanner.nextInt();
        System.out.println(prime_numbers(a, b));
        scanner.close();
    }

    static String prime_numbers(int a, int b){
        String result = "";
        
        for (int i = a; i <= b; i++) {
            if (isPrime(i)) {
                result += i + " ";
            }
        }
        return result.trim();
    }
    static boolean isPrime(int a) {
        if (a <= 1) {
                return false;
            }
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
                }
            }
            return true;
    }
}

