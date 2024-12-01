package Seminar1;

import java.util.Scanner;
/*2. Вывести все чётные числа от 1 до 100 */
public class DZ1_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите для чётных чисел чисел: ");
        int a = scanner.nextInt();
        System.out.print("Введите конец чётных чисел: ");
        int b = scanner.nextInt();
        System.out.println(even_numbers(a, b));
        scanner.close();
    }

    static String even_numbers(int a, int b){
        StringBuilder result = new StringBuilder();
        
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                result.append(i).append(" ");
            }
        }
        return result.toString().trim();
    }
    
}