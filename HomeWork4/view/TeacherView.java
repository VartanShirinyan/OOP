package HomeWork4.view;

import java.util.List;
import java.util.logging.Logger;

import HomeWork4.data.Teacher;

public class TeacherView implements UserView<Teacher> {
    Logger logger = Logger.getLogger(TeacherView.class.getName());

    @Override
    public void sendOnConsole(List<Teacher> teachers) {
        for (Teacher user : teachers) {
            logger.info(user.toString());
        }
    }

    public void sendOnConsoleUserGroup(Teacher teacher) {
        logger.info(teacher.toString());
    }
}
