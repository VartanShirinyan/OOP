package HomeWork4.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import HomeWork4.data.Teacher;

public class TeacherService implements UserService<Teacher> {
    private final List<Teacher> teachers;

    public TeacherService() {
        this.teachers = new ArrayList<>();
    }

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    @Override
    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        Long countMaxId = teachers.stream().mapToLong(Teacher::getTeacherId).max().orElse(0L) + 1;
        Teacher teacher = new Teacher(firstName, secondName, patronymic, dateOfBirth);
        teacher.setTeacherId(countMaxId);
        teachers.add(teacher);
    }

}
