package lab01VariablesOperators;

public class CoinChange {
    public static void main(String[] args) {

        int priceInCents = 85;
        int change = 100 - priceInCents; // 35--> 1 quarter 1 dime =25+10 cents

        int quarter = change / 25;
        int dime = (change % 25) / 10;
        int nickles = ((change % 25) % 10) / 5;


        System.out.println("quarter: " + quarter + " Dime: " + dime
        + " Nickles: " + nickles);


    }
}
