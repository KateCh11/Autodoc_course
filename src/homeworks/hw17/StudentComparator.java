package homeworks.hw17;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o2.getAverageGrade(), o1.getAverageGrade());
    }
}
