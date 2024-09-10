package HomeWork3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudentGroup> {
    private List<StudentGroup> studentGroups;

    public Stream() {
        this.studentGroups = new ArrayList<>();
    }

    public void addStudentGroup(StudentGroup group) {
        studentGroups.add(group);
    }

    public List<StudentGroup> getStudentGroups() {
        return studentGroups;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new Iterator<StudentGroup>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < studentGroups.size();
            }

            @Override
            public StudentGroup next() {
                return studentGroups.get(index++);
            }
        };
    }
}
