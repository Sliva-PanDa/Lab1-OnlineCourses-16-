import java.util.ArrayList;
import java.util.List;

public class Course {
    private String name;
    private int duration; // в часах
    private Teacher teacher;
    private List<Student> students = new ArrayList<>();

    public Course(String name, int duration, Teacher teacher) {
        this.name = name;
        this.duration = duration;
        this.teacher = teacher;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getDuration() { return duration; }
    public void setDuration(int duration) { this.duration = duration; }
    public Teacher getTeacher() { return teacher; }
    public void setTeacher(Teacher teacher) { this.teacher = teacher; }
    public List<Student> getStudents() { return students; }
    public void addStudent(Student student) { students.add(student); }
}