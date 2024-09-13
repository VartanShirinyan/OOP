package service;

import java.util.List;

import model.Student;
import model.StudyGroup;
import model.Teacher;

public class StudyGroupService {
    public StudyGroup fromStudyGroup(Teacher teacher, List<Student> students) {
        return new StudyGroup(teacher, students);
    }
}
