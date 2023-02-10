import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        int i = 5;
        while (i <= 15){
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

        for (int a = 0; a <= 100; a += 2){
            System.out.println(a);
        }
        for (int b = 100; b >= 0; b -= 5){
            System.out.println(b);
        }

        int z = 2;
        do{
            System.out.println(z);
            z *= 2;
        } while (z <= 1000000);

        for (int c = 1; c <= 100; c++) {
            if (c % 3 == 0 && c % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (c % 5 == 0) {
                System.out.println("Buzz");
            } else if (c % 3 == 0){
                System.out.println("Fizz");
            } else {
                System.out.println(c);
            }


            Scanner input = new Scanner(System.in);
            System.out.println("Enter and integer:");
            int d = Integer.parseInt(input.next());


        }
    }
}
