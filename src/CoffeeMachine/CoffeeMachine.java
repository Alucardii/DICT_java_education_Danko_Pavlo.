import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Starting to make a coffee");
        System.out.println("Write how many cups of coffee you will need:");

        int cups = scanner.nextInt();

        grindCoffeeBeans();
        boilWater();
        mixCoffeeWithWater();
        pourCoffeeIntoCup();
        pourMilkIntoCup();
        System.out.println("Coffee is ready!");

        calculateIngredients(cups);
    }

    private static void calculateIngredients(int cups) {
        int water = cups * 200;
        int milk = cups * 50;
        int coffeeBeans = cups * 15;

        System.out.println("For " + cups + " cups of coffee you will need:");
        System.out.println(water + " ml of water");
        System.out.println(milk + " ml of milk");
        System.out.println(coffeeBeans + " g of coffee beans");
    }
    private static void grindCoffeeBeans() {
        System.out.println("Grinding coffee beans");
    }

    private static void boilWater() {
        System.out.println("Boiling water");
    }

    private static void mixCoffeeWithWater() {
        System.out.println("Mixing boiled water with crushed coffee beans");
    }

    private static void pourCoffeeIntoCup() {
        System.out.println("Pouring coffee into the cup");
    }
    private static void pourMilkIntoCup() {
        System.out.println("Pouring some milk into the cup");
    }
}
