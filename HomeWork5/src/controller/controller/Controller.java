package controller;

import java.util.List;

import service.DataService;
import service.StudyGroupService;
import view.StudentView;
import model.User;
import model.Type;
import model.Student;
import model.StudyGroup;
import model.Teacher;

public class Controller {
    private final DataService service = new DataService();

    private final StudentView view = new StudentView();
    private final StudyGroupService studyGroupService = new StudyGroupService();

    public void createStudent(String firstName, String lastName, String middleName) {
        service.create(firstName, lastName, middleName, Type.STUDENT);
    }

    public void getAllStudent() {
        List<User> userList = service.getAllStudent();
        for (User user : userList) {
            Student student = (Student) user;
            view.printOnConsole(student);
        }
    }

    public StudyGroup createStudyGroup(Teacher teacher, List<Student> students) {
        return studyGroupService.fromStudyGroup(teacher, students);
    }
}
