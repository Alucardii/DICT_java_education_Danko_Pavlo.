public class ChatBot {
    public static void main(String[] args) {
        // Определіть ім'я бота і рік його створення
        String botName = "Botik";
        int birthYear = java.time.Year.now().getValue();

        // Виведіть привітання
        System.out.println("Hello! My name is " + botName + ".");
        System.out.println("I was created in " + birthYear + ".");
    }
}