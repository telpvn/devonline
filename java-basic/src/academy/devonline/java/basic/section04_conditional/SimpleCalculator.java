package academy.devonline.java.basic.section04_conditional;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        // read source date
        System.out.println("Enter 'a:");
        var a = new Scanner(System.in).nextInt();
        System.out.println("Enter 'b");
        var b = new Scanner(System.in).nextInt();
        System.out.println("Enter operator: {+,-,*,/,%}");
        var operator = new Scanner(System.in).nextLine().charAt(0);

        // processing
        String result;
        if (operator == '+') {
            result = "a + b = " + (a + b);
        } else if (operator == '-') {
            result = "a - b = " + (a - b);
        } else if (operator == '*') {
            result = "a * b = " + (a * b);
        } else if (operator == '/') {
            result = "a / b = " + (a / b);
        } else if (operator == '%') {
            result = "a % b = " + (a % b);
        } else {
            result = "Unsupported operator: " + operator;
        }

        // display result
        System.out.println(result);
    }
}
