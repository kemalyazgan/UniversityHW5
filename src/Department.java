import java.util.List;

public class Department {
    private String name;
    private List<Employee> employees;
    public static List<Course> courses;

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void addCourses(Course course) {
        courses.add(course);
    }



}
