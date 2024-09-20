package ru.gb.oseminar.view;

import ru.gb.oseminar.data.User;

import java.util.List;

/*
* Принцип разделения интерфейса (ISP)
* Интерфейс UserView может быть слишком большим, если он будет использоваться для различных видов представлений.
* Например, StudentView может не использовать все методы.
*/

public interface UserView<T extends User>{
    void sendOnConsole(List<T> list);
}
