import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lists {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        System.out.println(numbers);

        numbers.remove(3);
        System.out.println(numbers);

        numbers.add(3,0);
        System.out.println(numbers);

        numbers.add(1, 7);
        System.out.println(numbers);

        numbers.set(2, 8);
        System.out.println(numbers);

        System.out.println(numbers.get(3));
        numbers.clear();
        System.out.println(numbers);

        ArrayList<String> names = new ArrayList<>();
        names.add("John");
        names.add("Mary");
        names.add("Peter");
        names.add("Jane");
        names.add("John");
        System.out.println(names);
        names.remove("John");
        System.out.println(names);
        names.remove(0);
        System.out.println(names);
        names.add(0, "Bill");
        names.add(3, "Bob");
        names.add("Chuck");
        System.out.println(names);
        names.set(2, "Mary");
        System.out.println(names);
        System.out.println(names.get(3));
        names.clear();
        System.out.println(names);

        Map<String, String> usernames = new HashMap<>();
        usernames.put("John", "john123");
        usernames.put("Mary", "mary123");
        usernames.put("Peter", "peter123");
        usernames.put("Jane", "jane123");
        System.out.println(usernames);

        Map<String, Integer> userAges = new HashMap<>();
        userAges.put("John", 25);
        userAges.put("Mary", 30);
        userAges.put("Peter", 28);
        userAges.put("Jane", 27);
        System.out.println(userAges);




    }
}
