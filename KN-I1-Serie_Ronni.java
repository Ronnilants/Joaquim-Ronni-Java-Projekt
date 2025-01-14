import java.util.Scanner;

public class CurrencyConverter {

    private static final double USD_TO_CHF = 0.983;
    private static final double USD_TO_EUR = 0.91;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculation = true;

        while (continueCalculation) {

            System.out.println("This shoe costs ? USD");
            System.out.print("User enters: ");
            double priceUSD = scanner.nextDouble();

            System.out.println("Transport and customs costs are:");
            System.out.print("User enters: ");
            double transportCosts = scanner.nextDouble();

            System.out.println("Enter target currency (CHF or EUR):");
            System.out.print("User enters: ");
            String targetCurrency = scanner.next().toUpperCase();

            double exchangeRate = 0;
            switch (targetCurrency) {
                case "CHF":
                    exchangeRate = USD_TO_CHF;
                    break;
                case "EUR":
                    exchangeRate = USD_TO_EUR;
                    break;
                default:
                    System.out.println("Invalid currency. Please enter CHF or EUR.");
                    continue;
            }

            double result = (priceUSD + transportCosts) * exchangeRate;


            System.out.printf("Result is %s %.2f%n", targetCurrency, result);

            System.out.println("Do you want to calculate again? [Y/N]");
            System.out.print("User enters: ");
            String continueAnswer = scanner.next().toUpperCase();

            if (!continueAnswer.equals("Y")) {
                continueCalculation = false;
                System.out.println("Thank you for using me.");
            }
        }

        scanner.close();
    }
}