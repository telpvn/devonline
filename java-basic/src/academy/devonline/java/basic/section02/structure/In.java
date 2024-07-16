package academy.devonline.java.basic.section02.structure;

import java.util.Scanner;

public class In {
    public static void main(String[] args) {
        var a = new Scanner(System.in).nextInt();
        var b = new Scanner(System.in).nextInt();

        System.out.println(a + b);
    }
}
