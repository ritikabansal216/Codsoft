import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CurrencyConverterWithMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Double> conversionRates = new HashMap<>();
        
        // Store conversion rates in the map
        conversionRates.put("USD_to_EUR", 0.85);
        conversionRates.put("EUR_to_USD", 1.18);

        System.out.println("Currency Converter: USD to EUR and EUR to USD");
        System.out.println("Enter the amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // Consume newline character

        System.out.println("Enter the currency to convert from (USD or EUR): ");
        String fromCurrency = scanner.nextLine().toUpperCase();

        System.out.println("Enter the currency to convert to (USD or EUR): ");
        String toCurrency = scanner.nextLine().toUpperCase();

        String conversionKey = fromCurrency + "_to_" + toCurrency;

        if (conversionRates.containsKey(conversionKey)) {
            double convertedAmount = amount * conversionRates.get(conversionKey);
            System.out.println(amount + " " + fromCurrency + " is approximately " + convertedAmount + " " + toCurrency);
        } else {
            System.out.println("Conversion rate not found for the entered currencies.");
        }

        scanner.close();
    }
}
