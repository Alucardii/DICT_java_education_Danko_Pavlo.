package CoffeeMachine;

public class CoffeeMachine {
    public static void main(String[] args) {
        System.out.println("Starting to make a coffee");
        grindCoffeeBeans();
        boilWater();
        mixCoffeeWithWater();
        pourCoffeeIntoCup();
        pourMilkIntoCup();
        System.out.println("Coffee is ready!");
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
