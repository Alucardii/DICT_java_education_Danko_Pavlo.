// src/CreditCalculator/CreditCalculator.java

package CreditCalculator;
import java.util.Scanner;

public class CreditCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What do you want to calculate?");
        System.out.println("Type \"n\" for the number of monthly payments,");
        System.out.println("Type \"a\" for annuity monthly payment amount,");
        System.out.println("Type \"p\" for loan principal:");
        String calculationType = scanner.next();

        Calculatorlogic calculatorLogic = new Calculatorlogic();

        if (args.length > 0) {
            String type = System.getProperty("type");
            String principal = System.getProperty("principal"); // P
            String periods = System.getProperty("periods"); // n
            String interest = System.getProperty("interest"); // for i calc
            String payment = System.getProperty("payment"); // A
            calculatorLogic.dataAnalyze(type, principal, periods, interest, payment);
        } else {

            if ("n".equalsIgnoreCase(calculationType)) {

            } else if ("a".equalsIgnoreCase(calculationType)) {

            } else if ("p".equalsIgnoreCase(calculationType)) {

            } else {
                System.out.println("Invalid calculation type. Please type \"n\", \"a\", or \"p\".");
            }
        }

        scanner.close();
    }
}