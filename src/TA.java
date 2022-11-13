import java.util.List;

public class TA extends Employee {

    private String expiry;
    private List<Course> teachingcourses;


    public List<Course> getCourse() {
        return this.teachingcourses;
    }
    public String getName() {
       return super.getName();
    }

    public void extendContract(Course course) {

    }
}
