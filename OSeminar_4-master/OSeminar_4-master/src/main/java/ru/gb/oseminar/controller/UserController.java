package ru.gb.oseminar.controller;

import ru.gb.oseminar.data.User;

import java.time.LocalDate;
/*
* Принцип подстановки Барбары Лисков (LSP)
* Нужно убедиться в том что при реализации интерфейса UserController,
* все реализующие классы соблюдают контракты и не нарушают ожидаемое поведение.
* Например, при создании подкласса AdminController, он должен работать корректно с тем же методом.
*/

public interface UserController<T extends User>{
    void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth);
}
