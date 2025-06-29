// Simple Rule-Based Chatbot
// Made with 💻 by Naman Kaushik

import java.util.Scanner;

public class MyChatbot {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Chatbot: Namaste! How can I help you today?");

        while (true) {
            System.out.print("You: ");
            String userText = input.nextLine().toLowerCase().trim(); // taking input in lowercase for easy comparison

            if (userText.equals("hello")) {
                System.out.println("Chatbot: Hello! Nice to see you.");
            } else if (userText.equals("how are you?")) {
                System.out.println("Chatbot: I'm doing great! Thanks for asking. Aur aap?");
            } else if (userText.equals("bye")) {
                System.out.println("Chatbot: Alvida! Take care 😊");
                break;
            } else {
                System.out.println("Chatbot: Sorry bhai, samajh nahi aaya 😅");
            }
        }

        input.close();
    }
}
