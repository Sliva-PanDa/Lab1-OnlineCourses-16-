import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DataManager.initData();
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Система онлайн-курсов ===");
	System.out.println("Конфликтная строка из master");
        while (true) {
            System.out.println("\n1. Поиск студентов на курсе");
            System.out.println("2. Фильтрация курсов по продолжительности");
            System.out.println("3. Выход");
            System.out.print("Выберите опцию: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Очистка буфера

            if (choice == 1) {
                System.out.print("Введите название курса: ");
                String courseName = scanner.nextLine();
                List<Student> students = DataManager.findStudentsOnCourse(courseName);
                System.out.println("Студенты на курсе:");
                students.forEach(s -> System.out.println("- " + s.getName()));
            } else if (choice == 2) {
                System.out.print("Введите минимальную продолжительность (часы): ");
                int minDuration = scanner.nextInt();
                List<Course> filtered = DataManager.filterCoursesByDuration(minDuration);
                System.out.println("Курсы > " + minDuration + " часов:");
                filtered.forEach(c -> System.out.println("- " + c.getName() + " (" + c.getDuration() + " ч)"));
            } else if (choice == 3) {
                break;
            }
        }
        scanner.close();
    }
}