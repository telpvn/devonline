package academy.devonline.java.basic.section04_conditional;

import java.util.Scanner;

public class WeekDay {
    public static void main(String[] args) {
        // read source date
        System.out.println("Введите номер дня недели:");
        var day = new Scanner(System.in).nextInt();

        // processing
        String result;
        if (day == 1) {
            result = "Monday";
        } else if (day == 2) {
            result = "Tuesday";
        } else if (day == 3) {
            result = "Wednesday";
        } else if (day == 4) {
            result = "Thursday";
        } else if (day == 5) {
            result = "Friday";
        } else if (day == 6) {
            result = "Saturday";
        } else if (day == 7) {
            result = "Sunday";
        } else {
            result = "Вы ввели не корректное число " + day;
        }

        // display result
        System.out.println(result);
    }
}