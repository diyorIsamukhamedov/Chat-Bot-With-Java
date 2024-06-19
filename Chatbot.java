// Import necessary library
import java.util.Scanner;

public class Chatbot {
    public static void main(String[] args) {
        // Create scanner instance to read input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! My name is Jarvis.");
        System.out.println("I was created in 2024.");
        System.out.println("Please, remind me your name.");
        System.out.print("> ");

        String name = scanner.nextLine();

        System.out.println("What a great name you have, " + name + "!");
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        System.out.print("> ");

        int rem3 = scanner.nextInt();
        System.out.print("> ");
        int rem5 = scanner.nextInt();
        System.out.print("> ");
        int rem7 = scanner.nextInt();

        int yourAge = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;

        System.out.println("Your age is " + yourAge + " that's a good time to start programming!");
        System.out.println("Now I will prove to you that I can count to any number you want.");
        System.out.print("> ");

        int userNum = scanner.nextInt();

        for (int i = 0; i <= userNum; i++) {
            System.out.println(i + "!");
        }

        System.out.println("Let's test your programming knowledge.");
        System.out.println("Why do we use methods?");
        int two = 2;

        System.out.println("1. To repeat a statement multiple times.");
        System.out.println(two + ". To decompose a program into several small subroutines.");
        System.out.println("3. To determine the execution time of a program.");
        System.out.println("4. To interrupt the execution of a program.");

        while (true) {
            System.out.print("> ");
            int userGuess = scanner.nextInt();

            if (userGuess == two) {
                System.out.println("Congratulations, have a nice day!");
                break;
            } else {
                System.out.println("Please, try again.");
            }
        }

        }
    }
