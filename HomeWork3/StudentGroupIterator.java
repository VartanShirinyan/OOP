package HomeWork3;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class StudentGroupIterator implements Iterator<Student> {
    private int counter;
    private final List<Student> students;

    public StudentGroupIterator(StudentGroup studentGroup) {
        this.students = studentGroup.getStudents();
        this.counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < students.size();
    }

    @Override
    public Student next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return students.get(counter++);
    }

    @Override
    public void remove() {
        if (counter == 0) {
            throw new IllegalStateException("Уже вызван метод next().");
        }
        students.remove(--counter);
    }
}
