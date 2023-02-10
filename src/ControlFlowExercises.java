import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

        int i = 5;
        while (i <= 15) {
            System.out.println(i);
            i++;
        }

        int x = 0;
        do {
            System.out.println(x);
            x += 2;
        } while (x <= 100);

        int y = 100;
        do {
            System.out.println(y);
            y -= 5;
        } while (y >= 0);

        for (int a = 0; a <= 100; a += 2) {
            System.out.println(a);
        }
        for (int b = 100; b >= 0; b -= 5) {
            System.out.println(b);
        }

        double z = 2;
        do {
            System.out.println(z);
            z *= z;
        } while (z <= 1000000);

        for (int c = 1; c <= 100; c++) {
            if (c % 3 == 0 && c % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (c % 5 == 0) {
                System.out.println("Buzz");
            } else if (c % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(c);
            }
        }


            Scanner input = new Scanner(System.in);
            System.out.println("Enter an integer:");
            double m = Double.parseDouble(input.next());
            System.out.println("Here is your table!\n");
            System.out.println("number | squared | cubed\n------ | ------- | -------");
            for (double n = 1; n <= m; n++) {
                double nSb = n * n;
                double nCb = Math.pow(n, 3);
                System.out.printf("%-6.0f | %-6.0f  |  %-6.0f \n", n, nSb, nCb);
            }





            Scanner gQ = new Scanner(System.in);
        System.out.println("What is your grade?");
        int grade = Integer.parseInt(gQ.next());
        switch (grade) {
            case 100, 99 -> System.out.println("You got an A+!");
            case 98, 97, 96, 95, 94, 93, 92 -> System.out.println("You got an A!");
            case 91, 90 -> System.out.println("You got an A-!");
            case 89, 88 -> System.out.println("You got a B+!");
            case 87, 86, 85, 84, 83, 82 -> System.out.println("You got a B!");
            case 81, 80 -> System.out.println("You got a B-!");
            case 79, 78 -> System.out.println("You got a C+!");
            case 77, 76, 75, 74, 73, 72 -> System.out.println("You got a C!");
            case 71, 70 -> System.out.println("You got a C-!");
            case 69, 68 -> System.out.println("You got a D+!");
            case 67, 66, 65, 64, 63, 62 -> System.out.println("You got a D!");
            case 61, 60 -> System.out.println("You got a D-!");
            default -> System.out.println("You got an F!");
        }


    }
}
