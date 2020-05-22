public class Meal {
    public static void calculateTotalMealPrice(double listedMealPrice, double tipRate, double taxRate) {
        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        double result = listedMealPrice + tip + tax;

        System.out.println("Your total meal price is: " + result);
    }

    public static double calculateGroupTotalMealPrice(double listedMealPrice, double tipRate, double taxRate) {
        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        return listedMealPrice + tip + tax;
    }

    public static void main(String[] args) {
        calculateTotalMealPrice(15, .2, .08);
        calculateTotalMealPrice(20, .18, .21);

        double $groupMealPrice = calculateGroupTotalMealPrice(100, .2, .08);
        double $individualPrice = $groupMealPrice/5;
        System.out.println("Group total meal price is: " + $groupMealPrice);
        System.out.println("Each individual meal price is: " + $individualPrice);
    }
}
