package util;

import java.util.Scanner;

public class Input {
    private final Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        System.out.println("Enter a string:");
        return this.scanner.nextLine();
    }

    public boolean yesNo() {
        System.out.println("Enter yes or no:");
        String answer = this.scanner.nextLine();
        return answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes");
    }

    public int getInt(int min, int max) {
        System.out.printf("Enter a number between %d and %d:%n", min, max);
        int userInput = this.scanner.nextInt();
        if (userInput < min || userInput > max) {
            System.out.println("Invalid input.");
            return getInt(min, max);
        } else {
            return userInput;
        }
    }

    public int getInt() {
        System.out.println("Enter an integer:");
        return this.scanner.nextInt();
    }

    public double getDouble(double min, double max) {
        System.out.printf("Enter a number between %f and %f:%n", min, max);
        double userInput = this.scanner.nextDouble();
        if (userInput < min || userInput > max) {
            System.out.println("Invalid input.");
            return getDouble(min, max);
        } else {
            return userInput;
        }
    }

    public double getDouble() {
        System.out.println("Enter a number:");
        return this.scanner.nextDouble();
    }

    public static void main(String[] args) {
        Input input = new Input();
        System.out.println(input.getString());
        System.out.println(input.yesNo());
        System.out.println(input.getInt(1, 10));
        System.out.println(input.getInt());
        System.out.println(input.getDouble(1.0, 10.0));
        System.out.println(input.getDouble());
    }

    public double nextDouble() {
        return 0;
    }
}
