package HomeWork4.view;

import java.util.List;

import HomeWork4.data.User;

public interface UserView<T extends User> {
    void sendOnConsole(List<T> list);
}
