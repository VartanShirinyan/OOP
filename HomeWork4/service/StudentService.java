package HomeWork4.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import HomeWork4.data.Student;

public class StudentService implements UserService<Student> {

    private final List<Student> students;

    public StudentService() {
        this.students = new ArrayList<>();
    }

    @Override
    public List<Student> getAll() {
        return students;
    }

    @Override
    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        Long countMaxId = students.stream().mapToLong(Student::getStudentId).max().orElse(0L) + 1;
        Student student = new Student(firstName, secondName, patronymic, dateOfBirth, countMaxId);
        students.add(student);
    }
}
