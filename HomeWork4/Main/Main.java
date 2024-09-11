package HomeWork4.Main;

import HomeWork4.controller.StudentController;
import HomeWork4.controller.TeacherController;
import HomeWork4.data.Student;
import HomeWork4.data.Teacher;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        StudentController studentController = new StudentController();
        TeacherController teacherController = new TeacherController();

        // Создание учителей
        Teacher teacher = new Teacher("Борис", "Борисов", "Борисович", LocalDate.of(1985, 1, 15));
        teacherController.create(teacher.getFirstName(), teacher.getSecondName(), teacher.getPatronymic(),
                teacher.getDateOfBirth());

        // Создание студентов
        studentController.create("Михаил", "Мишустин", "Александрович", LocalDate.of(2000, 5, 25));
        studentController.create("Анна", "Сидорова", "Ивановна", LocalDate.of(2001, 7, 30));

        // Создание группы студентов
        studentController.createStudentGroup(teacher, Arrays.asList(
                new Student("Михаил", "Мишустин", "Александрович", LocalDate.of(2000, 5, 25)),
                new Student("Анна", "Сидорова", "Ивановна", LocalDate.of(2001, 7, 30))));

        // Поиск студента
        studentController.getStudentInStudentGroup("Михаил", "Мишустин");
    }
}
