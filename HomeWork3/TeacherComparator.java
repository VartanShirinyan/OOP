package HomeWork3;

import java.util.Comparator;

public class TeacherComparator implements Comparator<Teacher> {
    @Override
    public int compare(Teacher t1, Teacher t2) {
        return t1.getSecondName().compareTo(t2.getSecondName());
    }
}
