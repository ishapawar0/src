import java.util.Scanner;

public class currencyconverter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("HEY EVERYONE,LET'S CONVERT THE+ CURRENCY");

        System.out.print("Enter the amount in USD: ");
        double amountUSD = sc.nextDouble();

        System.out.print("Enter the currency to convert to (e.g., EUR0, RUPEE, YUAN): ");
        String currency = sc.next().toUpperCase();

        double convertedAmount = 0;

        if (currency.equals("USD")) {
            convertedAmount = amountUSD;
        }
        else if (currency.equals("EURO")) {
            convertedAmount = amountUSD * 0.93;
        }
        else if (currency.equals("RUPEE")) {
            convertedAmount = amountUSD * 83.4;
        }
        else if (currency.equals("YUAN")) {
            convertedAmount = amountUSD * 7.23;
        }
        else {
            System.out.println("Invalid currency");
            return;
        }

        System.out.println("The converted amount is: " + convertedAmount );
    }
}


