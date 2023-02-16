import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        String[] people = new String[3];
        people[0] = "John";
        people[1] = "Jane";
        people[2] = "Joe";

        for (String person : people) {
            System.out.println(person);
        }

        System.out.println(Arrays.toString(addPerson(people, "Bob")));


    }

    public static String[] addPerson(String[] people, String person){
        String[] newPeople = Arrays.copyOf(people, people.length + 1);
        newPeople[newPeople.length - 1] = person;
        return newPeople;
    }


}
