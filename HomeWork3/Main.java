package HomeWork3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создание потоков и учебных групп
        Stream stream1 = new Stream();
        Stream stream2 = new Stream();

        // Создание учебных групп и студентов
        StudentGroup group1 = new StudentGroup("Группа 1");
        StudentGroup group2 = new StudentGroup("Группа 2");
        StudentGroup group3 = new StudentGroup("Группа 3");

        stream1.addStudentGroup(group1);
        stream1.addStudentGroup(group2);
        stream2.addStudentGroup(group3);

        // Создание списка потоков
        List<Stream> streams = new ArrayList<>();
        streams.add(stream1);
        streams.add(stream2);

        // Вывод информации до сортировки
        System.out.println("Потоки до сортировки:");
        printStreams(streams);

        // Сортировка потоков по количеству групп
        UserController controller = new UserController();
        controller.sortStreams(streams);

        // Вывод информации после сортировки
        System.out.println("Потоки после сортировки:");
        printStreams(streams);
    }

    // Метод для вывода информации о потоках
    private static void printStreams(List<Stream> streams) {
        for (Stream stream : streams) {
            System.out.println("Поток: ");
            for (StudentGroup group : stream) {
                System.out.println("   " + group);
            }
            System.out.println("Количество учебных групп: " + stream.getStudentGroups().size());
        }
    }
}
