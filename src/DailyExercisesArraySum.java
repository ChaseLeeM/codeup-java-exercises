public class DailyExercisesArraySum {

    /* TODO: create an array of doubles called numbers and assign five different values (try with and without an initializer).
    Find the sum of all five double values using an enhanced for loop.
 */
    static Double[] numbers = {1.0, 2.0, 3.0, 4.0, 5.0};

    public static double sumNumbers(Double[] numbers) {
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sumNumbers(numbers));
    }

}
