package Hangman;

import java.util.Scanner;
import java.util.Random;

public class Hangman {
    public static void main(String[] args) {
        System.out.println("HANGMAN");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Type \"play\" to play the game, \"exit\" to quit: > ");
            String choice = scanner.nextLine();

            if ("exit".equalsIgnoreCase(choice)) {
                break;
            } else if ("play".equalsIgnoreCase(choice)) {
                playHangmanGame();
            } else {
                System.out.println("Please enter a valid choice.");
            }
        }

        System.out.println("Goodbye!");
    }

    public static void playHangmanGame() {
        System.out.println("----------");

        // Створіть список слів
        String[] words = {"python", "java", "javascript", "kotlin"};

        // Випадковим чином виберіть слово зі списку
        Random random = new Random();
        int randomIndex = random.nextInt(words.length);
        String targetWord = words[randomIndex];

        // Створіть рядок для відображення слова з дефісами
        StringBuilder wordDisplay = new StringBuilder(targetWord.length());
        for (int i = 0; i < targetWord.length(); i++) {
            wordDisplay.append("-");
        }

        // Кількість залишених "життів" (спроб)
        int remainingAttempts = 8;

        // Рядок для введених літер
        StringBuilder enteredLetters = new StringBuilder();

        Scanner scanner = new Scanner(System.in);

        while (remainingAttempts > 0) {
            System.out.println(wordDisplay);
            System.out.print("Input a letter: > ");
            String userLetter = scanner.nextLine().toLowerCase();

            if (userLetter.length() != 1 || !Character.isLowerCase(userLetter.charAt(0))) {
                System.out.println("Please enter a lowercase English letter");
            } else if (enteredLetters.indexOf(userLetter) != -1) {
                System.out.println("You've already guessed this letter");
            } else if (targetWord.contains(userLetter)) {
                for (int i = 0; i < targetWord.length(); i++) {
                    if (targetWord.charAt(i) == userLetter.charAt(0)) {
                        wordDisplay.setCharAt(i, userLetter.charAt(0));
                    }
                }
                enteredLetters.append(userLetter);
            } else {
                System.out.println("That letter doesn't appear in the word");
                remainingAttempts--;
                enteredLetters.append(userLetter);
            }

            if (wordDisplay.toString().equals(targetWord)) {
                System.out.println(targetWord);
                System.out.println("You guessed the word!");
                System.out.println("You survived!");
                break;
            }
        }

        if (remainingAttempts == 0) {
            System.out.println("You lost!");
        }
    }
}
