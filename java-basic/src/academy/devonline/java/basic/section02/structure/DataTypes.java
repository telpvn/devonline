package academy.devonline.java.basic.section02.structure;

public class DataTypes {
    public static void main(String[] args) {
        int i = 0;
        System.out.println(Integer.MIN_VALUE + " < " + i + " < " + Integer.MAX_VALUE);

        double d = 0.1;
        System.out.println(Double.MIN_VALUE + " < " + d + " < " + Double.MAX_VALUE);

        boolean b1 = true;
        boolean b2 = false;

        char ch = 'a';
        System.out.println(Character.MIN_VALUE + " < " + ch + " (" + (int) ch + ") < " + Character.MAX_VALUE);

        String s = "Hello world";
        System.out.println(s);
    }
}
