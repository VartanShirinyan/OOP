package HomeWork4.controller;

import java.time.LocalDate;

import HomeWork4.data.User;

public interface UserController<T extends User> {
    void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth);
}
