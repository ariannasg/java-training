package essentials;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatting {
    public static void main(String[] args) {
        var doubleValue = 10_000_000.53;
        System.out.println("Value:" + doubleValue);

        System.out.println("Using number format");
        var numFormat = NumberFormat.getNumberInstance();
        System.out.println("Number: " + numFormat.format(doubleValue));

        System.out.println("\nUsing int format");
        var intFormat = NumberFormat.getIntegerInstance();
        System.out.println("Number: " + intFormat.format(doubleValue));
        intFormat.setGroupingUsed(false);
        System.out.println("Number: " + intFormat.format(doubleValue));

        System.out.println("\nUsing locale format");
        var locale = Locale.getDefault();
        var localeFormat = NumberFormat.getNumberInstance(locale);
        System.out.println("Number: " + localeFormat.format(doubleValue));

        locale = new Locale("fr", "FR");
        localeFormat = NumberFormat.getNumberInstance(locale);
        System.out.println("Number: " + localeFormat.format(doubleValue));
        locale = new Locale("de", "DE");
        localeFormat = NumberFormat.getNumberInstance(locale);
        System.out.println("Number: " + localeFormat.format(doubleValue));

        System.out.println("\nUsing currency format");
        var currencyFormatter = NumberFormat.getCurrencyInstance(locale);
        System.out.println("Number: " + currencyFormatter.format(doubleValue));
        locale = new Locale("en", "GB");
        currencyFormatter = NumberFormat.getCurrencyInstance(locale);
        System.out.println("Number: " + currencyFormatter.format(doubleValue));

        System.out.println("\nUsing decimal format");
        var df = new DecimalFormat("$00.00");
        System.out.println(df.format(1));
        System.out.println(df.format(doubleValue));
    }
}

//CONSOLE OUTPUT:
//Value:1.000000053E7
//Using number format
//Number: 10,000,000.53
//
//Using int format
//Number: 10,000,001
//Number: 10000001
//
//Using locale format
//Number: 10,000,000.53
//Number: 10 000 000,53
//Number: 10.000.000,53
//
//Using currency format
//Number: 10.000.000,53 €
//Number: £10,000,000.53
//
//Using decimal format
//$01.00
//$10000000.53
