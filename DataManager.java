import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DataManager {
    private static List<Course> courses = new ArrayList<>();
    private static List<Student> students = new ArrayList<>();
    private static List<Teacher> teachers = new ArrayList<>();

    public static void initData() {
        Teacher t1 = new Teacher("Иванов И.И.");
        Course c1 = new Course("Java Basics", 20, t1);
        t1.addTaughtCourse(c1);

        Student s1 = new Student("Петров П.П.");
        Student s2 = new Student("Сидорова С.С.");
        s1.enrollCourse(c1);
        s2.enrollCourse(c1);
        c1.addStudent(s1);
        c1.addStudent(s2);

        Teacher t2 = new Teacher("Смирнова А.А.");
        Course c2 = new Course("Algorithms", 15, t2);
        t2.addTaughtCourse(c2);

        students.add(s1);
        students.add(s2);
        teachers.add(t1);
        teachers.add(t2);
        courses.add(c1);
        courses.add(c2);
    }

    public static List<Student> findStudentsOnCourse(String courseName) {
        return courses.stream()
                .filter(c -> c.getName().equals(courseName))
                .findFirst()
                .map(Course::getStudents)
                .orElse(new ArrayList<>());
    }

    public static List<Course> filterCoursesByDuration(int minDuration) {
        return courses.stream()
                .filter(c -> c.getDuration() > minDuration)
                .collect(Collectors.toList());
    }
}