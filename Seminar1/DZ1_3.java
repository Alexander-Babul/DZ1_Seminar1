package Seminar1;

import java.util.Scanner;

/*3. Реализовать простой калькулятор */
/*Инструкция:цифра-ввод-(+,-,*,/)-ввод-цифра-ввод-(=)-ввод*/
public class DZ1_3 {
    public static void main(String[] args) {
        calc();
    }

    static void calc(){
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        String b = scanner.next();
        double c = scanner.nextDouble();
        String d = scanner.next();
        double result = 0;
        if(b.equals("+")){
            result = a + c;
        }
        if(b.equals("-")){
            result = a - c;
        }
        if(b.equals("*")){
            result = a * c;
        }
        if(b.equals("/")){
            result = a / c;
        }
        if(d.equals("=")){
            System.out.println(result);
        }
        scanner.close();
    }
}
