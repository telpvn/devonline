package academy.devonline.java.basic.section03_expression;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class DoubleAccuracyIssues {
    public static void main(String[] args) {
        System.out.println();
        {
            var a = 2;
            var b = 1.1;
            var c = a - b;
            System.out.println(c);
        }
        System.out.println();
        {
            BigDecimal a = new BigDecimal("2");
            BigDecimal b = new BigDecimal("1.1");
            BigDecimal c = a.subtract(b);
            System.out.println(c);
        }
        System.out.println();
        {
            System.out.println(22. / 7);
            System.out.println(new BigDecimal("22").setScale(20).divide(new BigDecimal("7"), RoundingMode.HALF_UP));
        }
    }
}
