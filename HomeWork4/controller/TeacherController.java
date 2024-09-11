package HomeWork4.controller;

import java.time.LocalDate;

import HomeWork4.data.Teacher;

import HomeWork4.service.TeacherService;

import HomeWork4.view.TeacherView;

public class TeacherController implements UserController<Teacher> {
    private final TeacherService dataService = new TeacherService();

    private final TeacherView teacherView = new TeacherView();

    @Override
    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        dataService.create(firstName, secondName, patronymic, dateOfBirth);
        teacherView.sendOnConsole(dataService.getAll());
    }

    public void displayAllTeachers() {
        teacherView.sendOnConsole(dataService.getAll());
    }

}
