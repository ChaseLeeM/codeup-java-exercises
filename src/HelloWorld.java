import java.sql.SQLOutput;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args){
        System.out.println("Hello World");
        System.out.print("Hello World");
        int myFavoriteNumber = 34;
        System.out.println(myFavoriteNumber);
        String myString = "3.14159";
        System.out.println(myString);
        long myNumber = 123;
        System.out.println(myNumber);
//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);
//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) "three";
//        int x = 4;
//        System.out.println(x += 5);
//        int x = 3;
//        int y = 4;
//        System.out.println(y *= x);
//        int x = 10;
//        int y = 2;
//        System.out.println(x /= y);
//        System.out.println(y =- x);

//      ***  Exercise Console IO***
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f", pi);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your favorite holiday:");
        String favoriteHoliday = sc.nextLine();
        System.out.println(favoriteHoliday);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age:");
        int age = scanner.nextInt();
        System.out.println(age);

        Scanner enter = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int num = enter.nextInt();
        System.out.println(num);

//        Scanner words = new Scanner(System.in);
//        System.out.println("Enter 3 words:");
//        while(words.hasNext()){
//            String word = words.next();
//            System.out.println(word);
//            break;
//        }

        Scanner noLoop = new Scanner(System.in);
        System.out.println("Enter three words:");
        String first = noLoop.next();
        String second = noLoop.next();
        String third = noLoop.next();
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);

        Scanner str1 = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = str1.nextLine();
        System.out.println(sentence);

        Scanner length = new Scanner(System.in);
        System.out.println("Enter the length of the room:");
        double lngth = Double.parseDouble(length.nextLine());
        Scanner width = new Scanner(System.in);
        System.out.println("Enter the width of the room:");
        double wdth = Double.parseDouble(width.nextLine());
        double area = wdth * lngth;
        double perimeter = (lngth + wdth) * 2;
        System.out.printf("The area of the room is: %.2f%n", area);
        System.out.printf("The perimeter of the room is: %.2f ", perimeter);


    }

}