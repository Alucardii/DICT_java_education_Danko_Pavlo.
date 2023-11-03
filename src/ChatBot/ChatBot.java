import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {

        String botName = "Botik";
        int birthYear = java.time.Year.now().getValue();

        System.out.println("Hello! My name is " + botName + ".");
        System.out.println("I was created in " + birthYear + ".");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, remind me your name.");
        String yourName = scanner.nextLine();

        System.out.println("What a great name you have, " + yourName + "!");

        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7:");

        int remainder3 = scanner.nextInt();
        int remainder5 = scanner.nextInt();
        int remainder7 = scanner.nextInt();

        int yourAge = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;

        System.out.println("Your age is " + yourAge + "; that's a good time to start programming!");

        System.out.println("Now I will prove to you that I can count to any number you want.");
        int userInp = scanner.nextInt();

        for (int i = 1; i <= userInp; i++) {
            System.out.println(i + "!");
        }

        System.out.println("Let's test your programming knowledge.");

        System.out.println("Why do we use methods?");
        System.out.println("1. To repeat a statement multiple times.");
        System.out.println("2. To decompose a program into several small subroutines.");
        System.out.println("3. To determine the execution time of a program.");
        System.out.println("4. To interrupt the execution of a program.");

        int userAnswer = scanner.nextInt();

        if (userAnswer == 2) {
            System.out.println("Congratulations, have a nice day!");
        } else {
            System.out.println("Please, try again.");
        }
    }
}
