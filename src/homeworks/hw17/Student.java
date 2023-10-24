package homeworks.hw17;

public class Student {
    private String name;
    private int averageGrade;

    public String getName() {
        return name;
    }

    public int getAverageGrade() {
        return averageGrade;
    }

    public Student(String name, int averageGrade) {
        this.name = name;
        this.averageGrade = averageGrade;
    }

    @Override
    public String toString() {
        return '\n' + "Student{" +
                "name='" + name + '\'' +
                ", averageGrade=" + averageGrade +
                '}';
    }
}
