package essentials;

import java.math.BigDecimal;

public class NumericPrecision {
    public static void main(String[] args) {
        double value = .012;
        double pSum = value + value + value;
        System.out.println(pSum);

        var stringValue = Double.toString(value);
        System.out.println(stringValue);
        var bigValue = new BigDecimal(stringValue);
        System.out.println(bigValue);
        var bigSum = bigValue.add(bigValue).add(bigValue);
        System.out.println(bigSum);
        System.out.println(bigSum.doubleValue());  // double
    }
}

//CONSOLE OUTPUT:

