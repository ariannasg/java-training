package essentials;

// String interpolation is the process of evaluating a string literal containing one or more placeholders
public class StringInterpolation {
    public static void main(String[] args) {
        var item = "Shirt";
        var size = "M";
        var price = 14.99;
        var color = "red";

        var template = "Clothing item: %s, size: %s, color: %s, price: $%f";
        System.out.println(template.formatted(item, size, color, price));

        var stringFormat = String.format(template, item, size, color, price);
        System.out.println(stringFormat);

        template = "Clothing item: %s, size: %s, color: %s, price: $%.2f";
        System.out.println(template.formatted(item, size, color, price));

    }
}

//CONSOLE OUTPUT:
//Clothing item: Shirt, size: M, color: red, price: $14.990000
//Clothing item: Shirt, size: M, color: red, price: $14.990000
//Clothing item: Shirt, size: M, color: red, price: $14.99
