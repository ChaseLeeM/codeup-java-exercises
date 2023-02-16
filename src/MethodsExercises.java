import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        System.out.println(Addition(7,9));
        System.out.println(Subtraction(4,7));
        System.out.println(Multiplication(6,8));
        System.out.println(Division(12,4));
        System.out.println(Division(36,2) % Multiplication(2,4));
        System.out.println(getInteger(1,10));
        System.out.println(factorial(1,1));
        System.out.println(diceRoll(1,6));



    }
    public static int Addition(int x, int y){
        return x + y;
    }
    public static int Subtraction(int x, int y){
        return x - y;
    }
    public static int Multiplication(int x, int y){
        return x * y;
    }
    public static int Division(int x, int y){
        return x / y;
    }

    public static int getInteger(int min, int max){
        System.out.println("Enter a number between 1 and 10: ");
        Scanner intScan = new Scanner(System.in);
        int userInput = intScan.nextInt();
        if (userInput < min || userInput > max) {
            System.out.println("Invalid input.");
            return getInteger(min, max);
        } else {
            return userInput;
        }
    }

    public static int factorial(int x, int i){
        Scanner factScan = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 10: ");
        int userInput = factScan.nextInt();
        if (userInput < 1 || userInput > 10) {
            System.out.println("Invalid input.");
            return getInteger(1, 10);
        } else {
            for (int j = 1; j <= userInput; j++) {
                i *= j;
            }
            return i;
        }

    }
    public static int diceRoll(int x, int i){
        Scanner dice = new Scanner(System.in);
        System.out.println("Enter the number of sides for a pair of dice:");
        int userInput = dice.nextInt();
                if (userInput < 1 || userInput > 100) {
            System.out.println("Invalid input.");
            return getInteger(1, 100);
        } else {
            int userRoll = (int) (Math.random() * userInput) + 1;
            int userRoll2 = (int) (Math.random() * userInput) + 1;
            return userRoll + userRoll2;
        }
    }


}
