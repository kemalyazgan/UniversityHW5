import java.util.List;

public class Student {
    private int id;
    private String name;
    private List<Course> registeredcourses;
    public List<Exam> exams;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void addCourse(Course course) {
        registeredcourses.add(course);
    }
}
