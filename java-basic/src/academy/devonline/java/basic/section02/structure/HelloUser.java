package academy.devonline.java.basic.section02.structure;

import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        System.out.println("What is your name?");
        var name = new Scanner(System.in).nextLine();

        System.out.println("Hello, " + name);
    }
}
