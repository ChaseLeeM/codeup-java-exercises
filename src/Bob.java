import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner comment = new Scanner(System.in);
        System.out.println("What do you want to say to Bob?");
        String attitude = comment.nextLine();
        if (attitude.endsWith("!")) {
            System.out.println("Whoa, chill out!");
        } else if (attitude.endsWith("?")) {
            System.out.println("Sure.");
        } else if (attitude.equals("")) {
            System.out.println("Fine. Be that way!");
        } else {
            System.out.println("Whatever.");
        }
    }
}
