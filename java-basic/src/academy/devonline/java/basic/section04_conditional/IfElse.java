//package academy.devonline.java.basic.section04_conditional;
//
//import java.util.Scanner;
//
//public class IfElse {
//    public static void main(String[] args) {
//        var a = new Scanner(System.in).nextInt();
//        var b = new Scanner(System.in).nextInt();
//
//        if (a > b) {
//            var result = ("a > b");
//            System.out.println(result);
//        }
//
//        //
//        if (a > b) {
//            System.out.println("a > b");
//        } else {
//            System.out.println("a <= b");
//        }
//
//        //
//        if (a > b) {
//            System.out.println("a > b");
//        } else {
//            if (a < b) {
//                System.out.println("a < b");
//            } else {
//                System.out.println("a = b");
//            }
//        }
//            System.out.println("after");
//
//        //
//        if (a > b) {
//            System.out.println("a > b");
//        } else if (a < b) {
//            System.out.println("a < b");
//        } else {
//            System.out.println("a = b");
//        }
//
//        //
//        boolean condition = a > b;
//        if (condition) {
//            System.out.println("condition = true");
//        }
//
//        //
//        if (condition || a < b && a > 1 || !(b < 7)){
//            System.out.println("Complex condition example");
//        }
//    }
//}

//

package academy.devonline.java.basic.section04_conditional;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author devonline
 * @link http://devonline.academy/java-basic
 */
public class IfElse {
    public static void main(String[] args) {
        // Используем try-with-resources для автоматического закрытия Scanner
        try (Scanner scanner = new Scanner(System.in)) {
            // Используем обработку исключений для корректной обработки некорректного ввода
            try {
                System.out.print("Введите первое число (a): ");
                var a = scanner.nextInt();

                System.out.print("Введите второе число (b): ");
                var b = scanner.nextInt();

                // Пример 1: Простой if
                if (a > b) {
                    var result = "a > b";
                    System.out.println("Пример 1: " + result);
                }

                // Пример 2: if-else
                if (a > b) {
                    System.out.println("Пример 2: a > b");
                } else {
                    System.out.println("Пример 2: a <= b");
                }

                // Пример 3: Вложенные if-else
                if (a > b) {
                    System.out.println("Пример 3: a > b");
                } else {
                    if (a < b) {
                        System.out.println("Пример 3: a < b");
                    } else {
                        System.out.println("Пример 3: a = b");
                    }
                }
                System.out.println("После условия 3");

                // Пример 4: if-else if-else (компактная запись)
                if (a > b) {
                    System.out.println("Пример 4: a > b");
                } else if (a < b) {
                    System.out.println("Пример 4: a < b");
                } else {
                    System.out.println("Пример 4: a = b");
                }

                // Пример 5: Использование булевой переменной
                boolean condition = a > b;
                if (condition) {
                    System.out.println("Пример 5: condition=true (a > b)");
                } else {
                    System.out.println("Пример 5: condition=false (a <= b)");
                }

                // Пример 6: Сложное логическое выражение с комментариями для понимания
                boolean complexCondition = condition || (a < b && a > 1) || !(b < 7);
                System.out.println("Составные части сложного условия:");
                System.out.println("- condition (a > b): " + condition);
                System.out.println("- (a < b && a > 1): " + (a < b && a > 1));
                System.out.println("- !(b < 7) (т.е. b >= 7): " + !(b < 7));

                if (complexCondition) {
                    System.out.println("Пример 6: Сложное условие истинно");
                } else {
                    System.out.println("Пример 6: Сложное условие ложно");
                }

            } catch (InputMismatchException e) {
                System.out.println("Ошибка: введено не целое число. Пожалуйста, запустите программу снова и введите целые числа.");
            }
        }
    }
}