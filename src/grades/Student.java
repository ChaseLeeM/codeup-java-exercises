package grades;

public class Student {
    private String name;
    private int[] grades;
    private String githubUsername;


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGithubUsername() {
        return githubUsername;
    }
    public void setGithubUsername(String githubUsername) {
        this.githubUsername = githubUsername;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    public Student(String name, String githubUsername, int[] grades) {
        this.name = name;
        this.githubUsername = githubUsername;
        this.grades = new int[3];
    }

    public void addGrade(int grade) {
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] == 0) {
                grades[i] = grade;
                break;
            }
        }
    }
    public double getGradeAverage() {
        double sum = 0;
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }
        return sum / grades.length;
    }

}
