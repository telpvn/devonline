package academy.devonline.java.basic.section03_expression;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        System.out.println("Введите первое число: ");
        var a = new Scanner(System.in).nextInt();
        System.out.println("Введите второе число: ");
        var b = new Scanner(System.in).nextInt();

        var aPlusB = a + b;
        var aMinusB = a - b;
        var aMulB = a * b;
        var aDivB = a / b;
        var aModB = a % b;

        System.out.println("a + b = " + aPlusB);
        System.out.println("a - b = " + aMinusB);
        System.out.println("a * b = " + aMulB);
        System.out.println("a / b = " + aDivB);
        System.out.println("a % b = " + aModB);

    }
}
