package HomeWork3;

import java.util.List;

public class StudentGroup implements Iterable<Student> {
    private List<Student> students;
    private Teacher teacher;

    public StudentGroup(Teacher teacher, List<Student> students) {
        this.students = students;
        this.teacher = teacher;
    }

    public StudentGroup(String string) {
        // TODO Auto-generated constructor stub
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public StudentGroupIterator iterator() {
        return new StudentGroupIterator(this);
    }

    @Override
    public String toString() {
        return "StudentGroup{" +
                "students=" + students +
                ", teacher=" + teacher +
                '}';
    }
}
