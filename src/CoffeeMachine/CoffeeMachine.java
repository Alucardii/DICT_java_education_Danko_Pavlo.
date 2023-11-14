import java.util.Scanner;

public class CoffeeMachine {
    private static int cupsNeeded;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write how many ml of water the coffee machine has:");
        int availableWater = scanner.nextInt();

        System.out.println("Write how many ml of milk the coffee machine has:");
        int availableMilk = scanner.nextInt();

        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int availableCoffeeBeans = scanner.nextInt();

        System.out.println("Write how many cups of coffee you will need:");
        cupsNeeded = scanner.nextInt();

        int waterForCups = cupsNeeded * 200;
        int milkForCups = cupsNeeded * 50;
        int coffeeBeansForCups = cupsNeeded * 15;

        String resultMessage = checkIngredients(availableWater, availableMilk, availableCoffeeBeans, waterForCups, milkForCups, coffeeBeansForCups);

        System.out.println(resultMessage);
    }
    private static String checkIngredients(int availableWater, int availableMilk, int availableCoffeeBeans, int waterForCups, int milkForCups, int coffeeBeansForCups) {
        int possibleCupsByWater = availableWater / 200;
        int possibleCupsByMilk = availableMilk / 50;
        int possibleCupsByCoffeeBeans = availableCoffeeBeans / 15;

        int maxCups = Math.min(possibleCupsByWater, Math.min(possibleCupsByMilk, possibleCupsByCoffeeBeans));

        if (maxCups >= cupsNeeded) {
            if (maxCups == cupsNeeded) {
                return "Yes, I can make that amount of coffee";
            } else {
                return "Yes, I can make that amount of coffee (and even " + (maxCups - cupsNeeded) + " more than that)";
            }
        } else {
            return "No, I can make only " + maxCups + " cups of coffee";
        }
    }
}
