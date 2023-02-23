package grades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<Student,Integer> students = new HashMap<>();
        Student student1 = new Student("Kenneth", "Kenneth@codeup", new int[]{100, 85, 90});
        Student student2 = new Student("Robert", "Robert@codeup", new int[]{75, 62, 100});
        Student student3 = new Student("Chase", "Chase@codeup", new int[]{92, 87, 76});
        Student student4 = new Student("Andre", "Andre@codeup", new int[]{92, 82, 100});
        System.out.println(student1.getName());
    }
}
