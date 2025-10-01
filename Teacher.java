import java.util.ArrayList;
import java.util.List;

public class Teacher {
    private String name;
    private List<Course> taughtCourses = new ArrayList<>();

    public Teacher(String name) {
        this.name = name;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public List<Course> getTaughtCourses() { return taughtCourses; }
    public void addTaughtCourse(Course course) { taughtCourses.add(course); }
}